class Employee:
    __eid = 1
    __pt = 200
    __ma = 1000
    def __init__(self,name:str,basic_sal:int):
        Employee.__eid+=1
        self.__name = name
        self.__basic_sal = basic_sal
        self.__pf = 0.12 * self.__basic_sal
        self.__hra = 0.5 * self.__basic_sal

    @property
    def _eid(self):
        return self.__eid

    @property
    def _name(self):
        return self.__name

    @_name.setter
    def _name(self, value:str):
        self.__name = value

    @property
    def _basic_sal(self):
        return self.__basic_sal

    @_basic_sal.setter
    def _basic_sal(self, value:int):
        self.__basic_sal = value

    @property
    def _pf(self):
        return self.__pf

    def _update_pf(self):
        self.__pf = 0.12*self.__basic_sal

    @property
    def _hra(self):
        return self.__hra

    def _update_hra(self):
        self.__hra = 0.5*self.__basic_sal









