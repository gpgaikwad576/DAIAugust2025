emp_list = list()
class Employee:
    _eid =1
    def __init__(self,ename,basic_sal):
        Employee._eid+=1
        self._ename = ename
        self._basic_sal = basic_sal
        self._pfp = 12
        self._pt = 200
        self._hrap = 50
        self._ma = 1000

    def calc_gross(self):
        pf = self._pfp*self._basic_sal/100
        hra = self._hrap*self._basic_sal/100
        return self._basic_sal+hra+self._ma

    def calc_net(self):
        pf = self._pfp*self._basic_sal/100
        return self.calc_gross()-pf-self._pt

    def __str__(self):
        return f"{self._eid} {self._ename} {self._basic_sal} {self._pfp} {self._pt} {self._hrap} {self._ma} {self.calc_net()} {self.calc_net()}"
