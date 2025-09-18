from abc import ABC,abstractmethod

# Write an application in support which sells candy by kg, cookies by dozen, ice-creams and sundae
# your application will be used for checkout system
# To do this you will have to implement inheritance hierarchy of classes derived from abstract class
# DessertItem
class DessertItem:
    _id=1
    def __init__(self,name):
        DessertItem._id+=1
        self.__name = name

    @abstractmethod
    def return_items_cost(self, quantity):
        pass

    def return_item_name(self):
        return self.__name

class Candy(DessertItem):
    def __init__(self,name,price):
        super().__init__(name)
        self.__price = price

    def return_items_cost(self,quantity):
        return quantity *self.__price/1000


class Cookie(DessertItem):
    def __init__(self,name,price):
        super().__init__(name)
        self.__price = price

    def return_items_cost(self,quantity):
        return quantity*self.__price/12

class IceCream(DessertItem):
    def __init__(self,name,price):
        super().__init__(name)
        self.__price = price

    def return_items_cost(self,quantity):
        return quantity*self.__price

class Toppings:
    _id=1
    def __init__(self,name,price):
        self._id+=1
        self.__name = name
        self.__price = price #per gram price

    def return_items_cost(self):
        #per gram topping calc
        return self.__price

    def return_items_name(self):
        return self.__name

# class Sundae(IceCream):
#     def __init__(self,name,toppings):
#         super().__init__(name)
#         self.__price = toppings.return_items_cost()
#
#     def return_items_cost(self,quantity):
#         return quantity*(self.return_items_cost()+self.__toppings.return_items_cost())
#
#     @classmethod
#     def display(cls):
#         return Toppings.__id


class Sundae(IceCream,Toppings):
    def __init__(self,name):
        super().__init__(name)
        self.__price = toppings.return_items_cost()

    def return_items_cost(self,quantity):
        return quantity*(self.return_items_cost()+self.__toppings.return_items_cost())

    @classmethod
    def display(cls):
        return Toppings.__id


print(Sundae.display())





# DessertItem has only one field name, constructor and one abstract method which returns cost of
# item and one
# concrete method which returns name of item
#
# Candy, Cookie and IceCream classes are extended from DessertItem, IceCream has one subclass
# Sundae
#
# A Candy item has weight in gms and price per kg which determines it's cost. e.g 200gms of FUdge
# @50/kg will
# cost 10rs.
#
# A Cookie item has number (units) and price per dozen, which can be used to determine cost.
# e.g. 4 cookies @10/dozen =3.4 rs
#
# An IceCream item simply has cost in rupees.
#
# The cost of Sundae is cost of IceCream plus toppings
#
# Create Checkout class and provide following features
# Enter dessertitem in cashRegister(this can be some collection)
# Clear cashRegister
# get number of items
# get total cost of items
# get String represeting all items in cart and their total (invoice)
#
# (Create two custom exception CartIsEmptyException and AmountInvalidException and show two
# cases raising these
#
# exceptions)