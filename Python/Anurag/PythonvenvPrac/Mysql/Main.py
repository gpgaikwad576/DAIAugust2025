import databaseConnectivity as db

from abc import ABC,abstractmethod
class Super(ABC):
    @abstractmethod
    def get_gross(self)->float:
        pass
    @abstractmethod
    def get_net(self)->float:
        pass


## Employee Class

class Employee(Super):
    # Constructor
    def __init__(self,empid,empname,basicSalary,medicalallowance):
        self.empid=empid
        self.empname=empname
        self.__basicSalary=basicSalary
        self.__pf=12
        self.__pt=200
        self.__hra=50
        self.__medicalAllowance=medicalallowance



    # getter
    def get_basic_salary(self):
        return self.__basicSalary

    def get_pf_deduct(self):
        return (self.__basicSalary*self.__pf)/100

    def get_pt_deduct(self):
        return self.__pt

    def get_hra_deduct(self):
        return (self.__basicSalary*self.__hra)/100

    def get_medical_allowance(self):
        return self.__medicalAllowance

    def get_gross(self):
        return self.__basicSalary+self.get_hra_deduct()+self.get_medical_allowance()

    def get_net(self):
        return self.get_gross()-self.get_pf_deduct()-self.get_pt_deduct()

    def insert_into_db(self):
        db.execute_query("""insert into workforce values (self.empid, self.empname, self.__basicsalary)""")

    # Display
    def __str__(self):
        return f"Empid:{self.empid},EmpName:{self.empname},Salary:{self.get_basic_salary()},Pf:{self.get_pf_deduct()},pt:{self.get_pt_deduct()},Hra:{self.get_hra_deduct()},gross:{self.get_gross()},Net:{self.get_net()}"



# Manager Class

class Manager(Employee,Super):
    # Constructor
    def __init__(self,empid,empname,basicSalary,medicaAllowance):
        super().__init__(empid,empname,basicSalary,medicaAllowance)
        self.__managerAllowance=8
        self.__foodAllowance=10
        self.__otherAllowance=3


    # getter
    def get_manager_allowance(self):
        return (self.get_basic_salary()*self.__managerAllowance)/100

    def get_food_allowance(self):
        return (self.get_basic_salary()*self.__foodAllowance)/100

    def get_other_allowance(self):
        return (self.get_basic_salary()*self.__otherAllowance)/100

    def get_gross(self):
        return super().get_gross()+self.get_manager_allowance()+self.get_food_allowance()+self.get_other_allowance()
    # def get_net(self):
        return self.get_gross()-self.get_pf_deduct()-self.get_pt_deduct()
    def insert_into_db(self):
        db.execute_query("""insert into manager values (self.empid, super().get_pf_deduct(self), super().get_pt_deduct(self),super().get_hra_deduct(self),get_medical_allowance(self),get_manager_allowance(self),get_food_allowance(self),get_other_allowance(self))""")
    # Display
    def __str__(self):
        return f"Empid:{self.empid},EmpName:{self.empname},Salary:{self.get_basic_salary()},ManagerAllowance:{self.get_manager_allowance()},Food Allowance:{self.get_food_allowance()},Other Allowance:{self.get_other_allowance()},Gross salary:{self.get_gross()},Net Salary:{self.get_net()}"


## Marketing Class
class MarketingExecutive(Employee,Super):
    # Constructor
    def __init__(self,empid,empname,basicsalary,medicalallowance,distance_travel):
        super().__init__(empid,empname,basicsalary,medicalallowance)
        self.__distance_travel=distance_travel
        self.__phoneallowance=1000

    # Getter
    def get_travel_allowance(self):
        return self.__distance_travel*5
    def get_phone_allowance(self):
        return self.__phoneallowance

    def get_gross(self):
        return super().get_gross()+self.get_travel_allowance()+self.get_phone_allowance()
    # def get_net(self):
    #     return self.get_gross()-self.get_pf_deduct()-self.get_pt_deduct()

    def insert_into_db(self):
        db.execute_query("""insert into marketingexecutive values (self.empid, super().get_pf_deduct(self), super().get_pt_deduct(self),super().get_hra_deduct(self),super().get_get_medical_allowance(self),get_travel_allowance(self),get_phone_allowance(self))""")

    # Display
    def __str__(self):
        return f"Empid:{self.empid},EmpName:{self.empname},Salary:{self.get_basic_salary()},Travel Allowance:{self.get_travel_allowance()},Phone Allowance:{self.get_phone_allowance()},Gross Salary:{self.get_gross()},Net Salary:{self.get_net()}"


## Main Program
if __name__ == "__main__":
    e1 = Employee(1, "Anurag", 50000, 12000)
    m1 = Manager(2, "Aniketh", 100000, 12000)
    me1 = MarketingExecutive(3, "Bhura", 40000, 12000,10)

    print(e1)
    print(m1)
    print(me1)
