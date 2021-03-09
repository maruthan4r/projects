import mysql.connector
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="Erzaismaili2002"
)

print(mydb)

mycursor = mydb.cursor()

mycursor.execute("CREATE DATABASE beispiel")