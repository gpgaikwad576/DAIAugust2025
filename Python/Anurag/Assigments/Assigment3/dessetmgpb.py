from abc import ABC,abstractmethod
class Dessert(ABC):
    # def __init__(self,name):
    #     self.name=name


    @abstractmethod
    def calculate_price(self)->float:
        pass

class Candy(Dessert):
    # price per kg
    price=50.0

    def __init__(self, name,quantity):
        # super().__init__(name)
        self.name=name
        self.quantity=quantity

    @classmethod
    def price_per_kg(cls):
        return cls.price/1000
    
    def calculate_price(self):
        return round(self.quantity*Candy.price_per_kg())
    
    def get_quantity(self):
        return str(self.quantity)+' gms'

class Cookies(Dessert):
    # price per dozen
    price=10.0 

    def __init__(self,name,quantity):
        self.name=name
        self.quantity=quantity

    @classmethod
    def price_per_peice(cls):
        return cls.price/12
    
    def calculate_price(self):
        return round(self.quantity*Cookies.price_per_peice())
    
    def get_quantity(self):
        return str(self.quantity)+' units'

class IceCreams(Dessert):
    # price per unit
    price=50.0

    def __init__(self,name,quantity):
        self.name=name
        self.quantity=quantity

    def calculate_price(self):
        return round(self.quantity*IceCreams.price)

    def get_quantity(self):
        return str(int(self.quantity))+'piece'

class Sundae(IceCreams):
    # price of toppings
    toppings_cost=20.0
    def __init__(self,name,quantity):
        super().__init__(name,quantity)
    def calculate_price(self):
        return round((super().calculate_price())+(self.quantity*Sundae.toppings_cost))
    
    def get_quantity(self):
        return str(int(self.quantity))+'piece'