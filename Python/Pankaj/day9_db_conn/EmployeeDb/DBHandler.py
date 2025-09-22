import pymysql as p
from day9_db_conn.EmployeeDb.Employee import Employee


class DBHandler:
    con = p.connect(host="localhost", user="root", password="Anurag@1", database="pgdai2", autocommit=True)
    cursor = con.cursor()

    @classmethod
    def select_employees(cls):
        cls.cursor.execute("select * from employee")
        employees = cls.cursor.fetchall()
        emp_list = list()
        for emp in employees:
            emp_obj = Employee(emp[0],emp[1],emp[2])
            emp_list.append(emp_obj)
        return emp_list

    @classmethod
    def delete_employees(cls):
        cls.cursor.execute("delete from employees")
        employees = cls.cursor.fetchall()
        return employees

    @classmethod
    def insert_employee(cls,emp):
        try:
            query ="INSERT INTO EMPLOYEE VALUES(%s,%s,%s)"
            values = (emp.empid,emp.ename,emp.salary)
            cls.cursor.execute(query,values)
            return True
        except Exception as e:
            print("Internal Error: ",e)
            return False

    @classmethod
    def update_employee(cls,id,keys,values,conditions):

        try:
            query = "UPDATE EMPLOYEE SET "
            for i in range(len(keys)):
                 query+=f"{keys[i]} = {values[i]},"






print(DBHandler.select_employees())