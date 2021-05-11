#pip install pymysql
#pip install pymongo

import pymysql as mydb  # Import MySQL Library
import pymongo as mondb  # Import MongoDB Library

mgoclient = mondb.MongoClient("mongodb://localhost:27017/")
mondb = mgoclient["purchase_history"]

mondbCol = mondb["customer_location"]

# Add Collection to MongoDB
def index(collection):
    productExist = mondbCol.find_one({'_id': collection[0]})
    if productExist is None:
        mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
        iProduct = {'_id': int(collection[0]),
                    'name': collection[1],
                    'address': collection[2],
                    'location': collection[3]
                    }
        attributes = getInvoiceIds(collection[0], mycon)
        iProduct['invoiceIds'] = attributes

        mondbCol.insert(iProduct)

    else:
        exit()
    return True

# Fetch Products from MySQL
def fetchdata():
    mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
    with mycon:
        print('connection to MySQL db successful')
        cur = mycon.cursor()
        cur.execute("SELECT id, name, address, contact\
                    FROM customer_location")
        data = cur.fetchall()
        return data

# Fetch Product Attributes
def getInvoiceIds(id, mycon):
    with mycon:
        cur = mycon.cursor()
        cur.execute("SELECT id \
                    FROM invoice \
                    WHERE customer_location_id =" + str(id))
        attributes = cur.fetchall()
        print(attributes)
        r = []
        for attribute in attributes:
            for attr in attribute:
                r.append(attr)
        return r

# Main Function
def main():
    products = fetchdata()
    for product in products:
        index(product)
main()