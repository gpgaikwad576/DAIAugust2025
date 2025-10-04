from abc import abstractmethod, ABC
import json

class DessertItem(ABC):
    def __init__(self,name:str,price:int):
        self._name = name
        self._price = price   #while creating the object, client program will enter the price as per convention e.g. /kg,/dozen

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, value:str):
        self._name =value

    @property
    def price(self):
        return

    @price.setter
    def price(self, value: int):
        self._price = value

    @abstractmethod
    def get_cost(self):
        pass

    def __repr__(self):
        # return json.dumps({"name":self._name,"price":self._price,"cost(per unit)":self.get_cost()})
        return {"name":self._name,"price":self._price,"cost(per unit)":self.get_cost()}

