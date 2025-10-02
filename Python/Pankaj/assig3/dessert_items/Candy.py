from assig3.dessert_items.DessertItem import DessertItem
import json


class Candy(DessertItem):
    def __init__(self,name:str,price:int,quantity:int):
        super().__init__(name,price,quantity)

    def get_cost(self):
        return self._quantity*self._price/1000



