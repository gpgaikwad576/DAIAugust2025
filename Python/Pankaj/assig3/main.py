from abc import ABC,abstractmethod

# Write an application in support which sells candy by kg, cookies by dozen, ice-creams and sundae
# your application will be used for checkout system
# To do this you will have to implement inheritance hierarchy of classes derived from abstract class
# DessertItem
cash_register = dict()
class DessertItem:
    _id=1
    def __init__(self,name):
        DessertItem._id+=1
        self.__name = name

    @abstractmethod
    def get_items_cost(self, quantity):
        pass

    def get_item_price(self):
        return self.__price

    def get_item_name(self):
        return self.__name

class Candy(DessertItem):
    def __init__(self,name,price):
        super().__init__(name)
        self.__price = price

    def get_items_cost(self,quantity):
        return quantity *self.__price/1000


class Cookie(DessertItem):
    def __init__(self,name,price):
        super().__init__(name)
        self.__price = price

    def get_items_cost(self,quantity):
        return quantity*self.__price/12

class IceCream(DessertItem):
    def __init__(self,name,price):
        super().__init__(name)
        self.__price = price

    def get_items_cost(self,quantity):
        return quantity*self.__price

class Toppings:
    _id=1
    def __init__(self,name,price):
        self._id+=1
        self.__name = name
        self.__price = price #per gram price

    def get_items_cost(self):
        #per gram topping calc
        return self.__price

    def return_items_name(self):
        return self.__name

class Sundae:
    def __init__(self,name,icecream,toppings):
        super().__init__(name)
        self.__icecream = icecream
        self.__toppings = toppings or []

    def add_toppings(self,*args):
        self.toppings.append(args)

    def get_items_cost(self,quantity):
        cost = self.__icecream.get_items_cost(quantity)
        for t in self.__toppings:
            cost+=t.get_items_cost()
        return cost

class Cart:
    items_in_cart={}
    def __init__(self,*it):
        if(len(it)%2 != 0):
            print("You have not entered either item or its count")
            return False

        for i in range(0,len(it),2):
            self.items_in_cart[it[i]] = it[i+1]
        return True

    def add_item(self,*it):
        if(len(it)%2 != 0):
            print("You have not entered, either item or its count")
            return False
        for i in range(0, len(it), 2):
            self.items_in_cart[it[i]] = it[i + 1]
        return True


    def remove_item(self,*delItems):
        try:
            for item in delItems:
                if(item in self.items_in_cart.keys()):
                    self.items_in_cart[item]-=1
                    if(self.items_in_cart[item] == 0):
                        self.items_in_cart.remove(item)
            return True
        except Exception as e:
            print(e)
            return False
        
    def __repr__(self):
        return f"{self.items_in_cart}"


class Checkout:
    @staticmethod
    def enter_in_cash_register(cart):
        if(len(cart.items_in_cart) == 0):
            print("Cart is empty")
            return False

        if (len(cart.items_in_cart) % 2 != 0):
            print("You have not entered, either item or its count")
            return False

        for item in  cart.items_in_cart.items():
            cash_register[item.getKey()] = item.getValue()

        return True

    @staticmethod
    def clear_cashregister():
        try:
            cash_register.clear()
        except Exception as e:
            print(f"Internal Error: {e}")

    @staticmethod
    def get_number_items(cart):
        cnt=0
        for v in cart.items_in_cart.values():
            cnt+=v
        return cnt
            

    @staticmethod
    def get_totalcost_items(cart):
        cost=0
        for item,quantity in cart.items_in_cart.items():
            cost+=item.get_items_cost(quantity)
        return cost

    @staticmethod
    def get_cart_details(cart):
        return cart


        






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