from .Employee import Employee

class Manager(Employee):
    def __init__(self,name:str,basic_sal:int):
        super().__init__(name,basic_sal)
        self.__man_allow = 0.08* basic_sal
        self.__food_allow = 0.1* basic_sal
        self.__other_allow = 0.03* basic_sal


    @property
    def man_allow(self):
        return self.__man_allow

    def update_man_allow(self):
        self.__man_allow = 0.08*self._basic_sal

    @property
    def food_allow(self):
        return self.__food_allow

    def update_food_allow(self):
        self.__food_allow = 0.1*self._basic_sal

    @property
    def other_allow(self):
        return self.__other_allow

    def update_other_allow(self):
        self.__other_allow = 0.03*self._basic_sal

    def calc_gross(self):
        return super().calc_gross()+self.__man_allow+self.__food_allow+self.__other_allow

    def calc_nett(self):
        return self.calc_gross() - self._pf - self._pt




