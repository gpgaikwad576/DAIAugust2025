import pymysql as p

con=p.connect(host="localhost",user="root",password="Anurag@1",database="pfdai_anurag")
c=con.cursor()
c.execute("create table Employee '(empid id primary key,)'")
tables = c.fetchall()
for table in tables:
    print(table)

con.close()
