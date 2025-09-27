from jinja2.utils import concat

from .Employee import Employee
import json

class MarketingExec(Employee):
    __phone_allow =1000
    def __init__(self,name:str,basic_sal:int,kms_travelled:int):
        super().__init__(name,basic_sal)
        self.__kms_travelled=kms_travelled
        self.__travel_allow = 5* self.__kms_travelled

    @classmethod
    def get_phone_allow(cls):
        return cls.__phone_allow

    @classmethod
    def change_phone_allow(cls,value:int):
        cls.__phone_allow = value

    @property
    def kms_travelled(self):
        return self.__kms_travelled

    @kms_travelled.setter
    def kms_travelled(self, value:int):
        self.__kms_travelled = value

    @property
    def travel_allow(self):
        return self.__travel_allow

    def __repr__(self):
        return json.dumps({**json.loads(super().__repr__()),"travel_allow":self.__travel_allow})