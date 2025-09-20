import pymysql as p
from day9.EmployeeDb.Employee import Employee
from day9.EmployeeDb.DBHandler import DBHandler

class Main:

    @classmethod
    def show_employees(cls):
        cls.cursor.execute("select * from employee")
        return cls.cursor.fetchall()

    @classmethod
    def add_employee(cls,employees_dict):
        emp =Employee(employees_dict.empid,employees_dict.name,employees_dict.salary)
        DBHandler.insert_employee(emp)


print(Main.select_employees())
print(Main.insert_employee({id:4,"name":"abc4", "salary":50000}))