#pip install pymysql
#pip install pymongo

import pymysql as mydb  # Import MySQL Library
import pymongo as mondb  # Import MongoDB Library
import multiprocessing as mp  # Import Multiprocessing

mgoclient = mondb.MongoClient("mongodb://localhost:27017/")
mondb = mgoclient["purchase_history"]
mondbCol = mondb["invoice_line"]

# Add Collection to MongoDB
def index(collection):
    productExist = mondbCol.find_one({'_id': collection[0]})
    if productExist is None:
        mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
        iProduct = {'_id': int(collection[0]),
                    'quantity': collection[1],
                    'weight': collection[2],
                    'unitOfMeasure': collection[3],
                    'unitPrice': collection[4],
                    'productId': collection[5],
                    'invoiceId' : collection[6]
                    }
        mondbCol.insert(iProduct)

    else:
        exit()
    return True

# Fetch Products from MySQL
def fetchdata():
    mycon = mydb.connect(user='root', password='1984', host='127.0.0.1', database='purchase_history')
    with mycon:
        print('connection successful')
        cur = mycon.cursor()
        cur.execute("SELECT id, quantity, weight, unit_of_measure, unit_price, \
            product_id, invoice_id FROM invoice_line")
        data = cur.fetchall()
        return data

# Main Function
def main():
    products = fetchdata()

    for product in products:
        index(product)
main()