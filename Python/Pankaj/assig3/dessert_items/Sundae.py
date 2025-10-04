import json

from assig3.dessert_items.IceCream import IceCream
from assig3.dessert_items.Toppings import Toppings


class Sundae(IceCream):
    def __init__(self, name: str,toppings_quant):
        super().__init__(name)           #Actually Icecream should be contained in, not inherited
        self.__toppings_quant = toppings_quant
        price =0
        for topping,quant in self.__toppings_quant.items():
            price+=(topping.price*quant)
        self.__price = price


    @property
    def price(self):
        return self.__price

    def get_cost(self):
        return self.__price

    def __repr__(self):
        sundae = {"name": self._name, "price": self._price, "cost(per unit)": self.get_cost(),'toppings':[]}
        for topping,quant in self.__toppings_quant.items():
            sundae['toppings'].append(topping.name)
        return sundae

