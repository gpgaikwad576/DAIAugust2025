from django.db import models


# class Employee(models.Model):
#     empid = models.IntegerField(default =0)
#     ename = models.CharField(max_length=200)
#     salary = models.IntegerField(default =0)
#     #upsert

class Employee(models.Model):
    _eid: models.IntegerField= models.IntegerField(primary_key=True,default =0)
    _ename: models.CharField = models.CharField(max_length = 200)
    _basic_sal: models.IntegerField= models.IntegerField(default =0)
    _pt: models.IntegerField= models.IntegerField(default = 200)
    _ma: models.IntegerField= models.IntegerField(default = 1000)

    @property
    def _pf(self):
        return int(self._basic_sal*0.12)

    def calc_gross(self):
        pf = self._pf*self._basic_sal/100
        hra = self._hra*self._basic_sal/100
        return self._basic_sal+hra+self._ma

    def calc_net(self):
        pf = self._pfp*self._basic_sal/100
        return self.calc_gross()-pf-self._pt

    def __str__(self):
        return f"{self._eid} {self._ename} {self._basic_sal} {self._pfp} {self._pt} {self._hrap} {self._ma} {self.calc_net()} {self.calc_net()}"


class Manager(Employee):
    def __init__(self,ename,basic_sal):
        super().__init__(ename,basic_sal)
        self.man_allow_per = 8
        self.food_allow_per = 10
        self.other_allow_per = 3

    def calc_gross(self):
        return super().calc_gross()+self.man_allow_per*self._basic_sal/100+self.food_allow_per*self._basic_sal/100+self.other_allow_per*self._basic_sal/100

    def calc_net(self):
        pf = self._pfp*self._basic_sal/100
        return self.calc_gross()-pf-self._pt

    def __str__(self):
        return f"{self._eid} {self._ename} {self._basic_sal} {self._pfp} {self._pt} {self._hrap} {self._ma} {self.man_allow_per} {self.food_allow_per} {self.other_allow_per}"

class MarkExecutive(Employee):
    def __init__(self,ename,basic_sal,kms_travelled):
        super().__init__(ename,basic_sal)
        self.kms_travelled = kms_travelled
        self.phone_allow = 1000
        self.travel_allow = 5*kms_travelled

    def calc_gross(self):
        return super().calc_gross()+self.phone_allow+self.travel_allow

    def calc_net(self):
        pf = self._pfp*self._basic_sal/100
        return self.calc_gross()-pf-self._pt

    def __str__(self):
        return f"{self._eid} {self._ename} {self._basic_sal} {self._pfp} {self._pt} {self._hrap} {self._ma} {self.kms_travelled} {self.phone_allow} {self.travel_allow}"