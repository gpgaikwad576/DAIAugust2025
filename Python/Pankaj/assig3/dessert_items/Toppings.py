

class Toppings:
    def __init__(self, name: str, price: int,quantity:int):
        self.__name = name
        self.__price = price
        self.__quantity = quantity

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value:int):
        self.__name = value

    @property
    def price(self):
        return self.__price

    @price.setter
    def price(self, value: int):
        self.__price = value

    @property
    def quantity(self):
        return self.__quantity

    @quantity.setter
    def quantity(self, value:int):
        self.__quantity = value

    def get_cost(self):
        return self.__quantity * self.__price / 1000

