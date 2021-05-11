#pip install pymysql
#pip install pymongo

import pymysql as mydb  # Import MySQL Library
import pymongo as mondb  # Import MongoDB Library
import multiprocessing as mp  # Import Multiprocessing

mgoclient = mondb.MongoClient("mongodb://localhost:27017/")
mondb = mgoclient["purchase_history"]
mondbCol = mondb["invoice"]

# Add Collection to MongoDB
def index(collection):
    productExist = mondbCol.find_one({'_id': collection[0]})
    if productExist is None:
        mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
        iProduct = {'_id': int(collection[0]),
                    'invoiceNum': collection[1],
                    'purchaseDate': collection[2],
                    'totalPurchase': collection[3],
                    'customerLocationId': collection[4],
                    'distributorLocationId': collection[5]
                    }

        invoiceLineIds = getInvoiceLineIds(collection[0], mycon)
        iProduct['invoiceLineIds'] = invoiceLineIds
        mondbCol.insert(iProduct)

    else:
        exit()
    return True

# Fetch Products from MySQL
def fetchdata():
    mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
    with mycon:
        cur = mycon.cursor()
        cur.execute("SELECT id, invoice_number, purchase_date, total_purchases, customer_location_id, \
            distributor_location_id FROM invoice")
        data = cur.fetchall()
        return data

# Fetch Product Attributes
def getInvoiceLineIds(id, mycon):
    with mycon:
        cur = mycon.cursor()
        cur.execute("SELECT id \
                    FROM invoice_line \
                    WHERE invoice_id =" + str(id))
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