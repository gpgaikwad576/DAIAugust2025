
# 1. Create a class Employee with following attributes and necessary constructor
# empid,ename,basicSalary, pf, pt, hra, medicalAllowance
# 1) create methods to calculate gross and net salary of employee
# 2) create a method to show details of employee
# (pf 12% of basicSalary, pt=200, hra=50% of basicSalary
# gross = basicSalary+hra+medical, net=gross-pf-pt)
#
# Create sub class Manager which inherits Employee with following extra attributes
# managerAllwance, foodAllowance, otherAllowance
# 1) calculate gross and net salary of Manager
# 2) display details
# (managerAllowance 8% of basicSalary, foodAllowance= 10% of basicSalary, otherAllowance= 3% of basicSalary)
#
# Create a sub class MarketingExecutive with following extra attributes
# travelAllowance, phoneAllowance
# 1) calculate gross and net salary of MarketingExecutive
# 2) display details
# (phoneAllowance=1000, travelAllowances 5 * kmsTravelled

# class Employee:
#     def __init__(self,empid,ename,salary):
#         self.empid = empid
#         self.ename = ename
#         self.salary = salary
#
#     emp_list = list()

class Employee:
    _eid = 1

    def __init__(self, ename, basic_sal):
        Employee._eid += 1
        self._ename = ename
        self._basic_sal = basic_sal
        self._pf = basic_sal*0.12
        self._pt = 200
        self._hra = basic_sal*0.50
        self._ma = 1000

    def calc_gross(self):
        pf = self._pf * self._basic_sal / 100
        hra = self._hra * self._basic_sal / 100
        return self._basic_sal + hra + self._ma

    def calc_net(self):
        pf = self._pf * self._basic_sal / 100
        return self.calc_gross() - pf - self._pt

    def __repr__(self):
        return f"{self._eid} {self._ename} {self._basic_sal} {self._pf} {self._pt} {self._hra} {self._ma} {self.calc_net()} {self.calc_net()}"

class Manager(Employee):
    def __init__(self, ename, basic_sal):
        super().__init__(ename, basic_sal)
        self.man_allow_per = 8
        self.food_allow_per = 10
        self.other_allow_per = 3

    def calc_gross(self):
        return super().calc_gross() + self.man_allow_per * self._basic_sal / 100 + self.food_allow_per * self._basic_sal / 100 + self.other_allow_per * self._basic_sal / 100

    def calc_net(self):
        pf = self._pf * self._basic_sal / 100
        return self.calc_gross() - pf - self._pt

    # def __str__(self):
    #     return f"{self._eid} {self._ename} {self._basic_sal} {self._pf} {self._pt} {self._hra} {self._ma} {self.man_allow_per} {self.food_allow_per} {self.other_allow_per}"

class MarkExecutive(Employee):
    def __init__(self, ename, basic_sal, kms_travelled):
        super().__init__(ename, basic_sal)
        self.kms_travelled = kms_travelled
        self.phone_allow = 1000
        self.travel_allow = 5 * kms_travelled

    def calc_gross(self):
        return super().calc_gross() + self.phone_allow + self.travel_allow

    def calc_net(self):
        pf = self._pf * self._basic_sal / 100
        return self.calc_gross() - pf - self._pt

    # def __str__(self):
    #     return f"{self._eid} {self._ename} {self._basic_sal} {self._pf} {self._pt} {self._hra} {self._ma} {self.kms_travelled} {self.phone_allow} {self.travel_allow}"