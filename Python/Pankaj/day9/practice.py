import pymysql as p
con = p.connect(host ="localhost",user="root",password = "Anurag@1",database = "pgdai2",autocommit=True)
cursor = con.cursor()

cursor.execute("show tables")#pointer to the database
cursor.execute("insert into employee values(3,'abc3',99000);")
cursor.execute("select * from employee")
data = cursor.fetchall()
print(data)
con.commit()
con.close()
