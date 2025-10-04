

class Toppings:
    def __init__(self, name: str, price: int):
        self.__name = name
        self.__price = price

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

    def get_cost(self):
        return self.__price / 1000

    def __repr__(self):
        return {"name": self.__name}

