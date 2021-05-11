#pip install pymysql
#pip install pymongo

import pymysql as mydb  # Import MySQL Library
import pymongo as mondb  # Import MongoDB Library
import multiprocessing as mp  # Import Multiprocessing

mgoclient = mondb.MongoClient("mongodb://localhost:27017/")
mondb = mgoclient["purchase_history"]
mondbCol = mondb["product"]

# Insert Products to MongoDB
def index(product):
    productExist = mondbCol.find_one({'_id': product[0]})
    if productExist is None:
        mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
        iProduct = {'_id': product[0],
                    'description': product[1],
                    'productCode': product[2],
                    'distributorLocationId': product[3],
                    'manufacturerLocationId': product[4]
                    }

        attributes = productAttributes(product[0], mycon)
        iProduct['invoiceLineIds'] = attributes

        mondbCol.insert(iProduct)

    else:
        exit()
    return True

# Fetch Products from MySQL
def fetchproducts():
    mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
    with mycon:
        print('connection successful')
        cur = mycon.cursor()
        cur.execute("SELECT id, description, product_code, distributor_location_id, manufacturer_location_id \
                    FROM product")
        products = cur.fetchall()
        return products

# Fetch Product Attributes
def productAttributes(id, mycon):
    with mycon:
        cur = mycon.cursor()
        cur.execute("SELECT id\
                    FROM invoice_line \
                    WHERE product_id =" + str(id))
        attributes = cur.fetchall()
        r = []
        for attribute in attributes:
            for attr in attribute:
                r.append(attr)
        return r

# Main Function
def main():
    products = fetchproducts()
    for product in products:
        index(product)
main()