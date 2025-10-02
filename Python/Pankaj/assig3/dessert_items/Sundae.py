
from assig3.dessert_items.IceCream import IceCream
from assig3.dessert_items.Toppings import Toppings


class Sundae(IceCream):
    def __init__(self, name: str, price: int,quantity:int,toppings:list[Toppings]):
        super().__init__(name,price,quantity)
        self.__toppings = toppings

    @property
    def price(self):
        price = self._price
        for topping in self.__toppings:
            price +=topping.price
        return price


    def get_cost(self):
        return self.price*self._quantity

