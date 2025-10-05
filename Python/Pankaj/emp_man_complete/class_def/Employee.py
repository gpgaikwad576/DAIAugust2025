# 1. Create a class Employee with following attributes and necessary constructor
# empid, ename, basicSalary, pf, pt, hra, medicalAllowance
# 1) create methods to calculate gross and net salary of employee
# 2) create a method to show details of employee
# (pf = 12% of basicSalary, pt=200, hra=50%% of basicSalary
# gross = basicSalary+hra+medical, net=gross-pf-pt)
#
# Create sub class Manager which inherits Employee with following extra attributes
# managerAllowance, foodAllowance, otherAllowance
# 1) calculate gross and net salary of Manager
# 2) display details
# (managerAllowance= 8% of basicSalary, foodAllowance= 10% of basicSalary, otherAllowance= 3% of basicSalary)
#
# Create a sub class Marketing Executive with following extra attributes
# travelAllowance, phoneAllowance
# (1) calculate gross and net salary of Marketing Executive
# 2) display details
# (phoneAllowance=1000, travelAllowance= 5* kmsTravelled
import json

class Employee:
    __iter_eid =1
    _pt = 200
    _ma = 1000
    def __init__(self,name:str,basic_sal:int):
        self._eid = Employee.__iter_eid
        self._name = name
        self._basic_sal = basic_sal
        self._pf = 0.12 * self._basic_sal
        self._hra = 0.5 * self._basic_sal
        Employee.__iter_eid+=1


    @classmethod
    def get_pt(cls):
        return cls._pt

    @classmethod
    def change_pt(cls,value:int):
        cls._pt = value

    @classmethod
    def get_ma(cls):
        return cls._ma

    @classmethod
    def change_ma(cls,value:int):
        cls._ma = value


    @property
    def eid(self):
        return self._eid

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, value:str):
        self._name = value

    @property
    def basic_sal(self):
        return self._basic_sal

    @basic_sal.setter
    def basic_sal(self, value:int):
        self._basic_sal = value
        self.update_pf()
        self.update_hra()

    @property
    def pf(self):
        return self._pf

    def update_pf(self):
        self._pf = 0.12*self._basic_sal

    @property
    def hra(self):
        return self._hra

    def update_hra(self):
        self._hra = 0.5*self._basic_sal



    def calc_gross(self):
        return self._basic_sal + self._hra +self._ma

    def calc_nett(self):
        return self.calc_gross()-self._pf-Employee._pt

    def __repr__(self):
        return json.dumps({"eid":self._eid,"name":self._name,"basic_sal":self._basic_sal})
        # return {"eid":self._eid,"name":self._name,"basic_sal":self._basic_sal}













