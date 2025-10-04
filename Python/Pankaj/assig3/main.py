from assig3.Checkout import Checkout
from assig3.dessert_items.Candy import Candy
from assig3.dessert_items.Cookie import Cookie
from assig3.dessert_items.IceCream import IceCream
from assig3.dessert_items.Sundae import Sundae
from assig3.dessert_items.Toppings import Toppings
from assig3.exceptions.AmountInvalidException import AmountInvalidException

# Write an application in support which sells candy by kg, cookies by dozen, ice-creams and sundae
# your application will be used for checkout system
# To do this you will have to implement inheritance hierarchy of classes derived from abstract class
# DessertItem
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
#json loads data from str to dict
#json dumps dict to str

#create later: enum for different dessert and flavours
#write input for entering details of add item

def display_items(items_list):
    items =""
    for item in items_list:
        items+=str(item)+"\n"
    return items







c1 = Candy("chinese",1000)
c2 = Candy("cotton",2000)
ck1 = Cookie("dark fantasey",12)
i1 = IceCream("vanilla",10)
i2 = IceCream("mango",20)

t1 = Toppings("choclate",1000)
t2 = Toppings("strawberry",1000)

s1 = Sundae("Vanilla Sundae",{t1:200,t2:300})

print("--------------------------------")
print("Enter 1 for adding an item\n")
print("Enter 2 for clearing cash register\n")
print("Enter 3 for getting number of items in the cart\n")
print("Enter 4 for getting total cost of the items\n")
print("Enter 5 for getting cash register(cart)\n")
print("Enter 6 for getting invoice\n")
print("Leave it Empty or enter any other key to Exit \n")
print("--------------------------------")

while True:
    opt = int(input("Enter an option: "))
    match opt:
        case 1:
            try:
                Checkout.add_item({c1:0,c2:200,ck1:3,i1:1,i2:2,s1:1})
            except AmountInvalidException as e:
                print("Exception: ",e)
        case 2:
            Checkout.clear_cash_reg()
        case 3:
            print(Checkout.get_number_of_items())
        case 4:
            try:
                print(Checkout.get_total_cost())
            except Exception as e:
                print("Exception as: ",e)
        case 5:
            print(display_items(Checkout.get_cash_register()))
        case 6:
            print(display_items(Checkout.get_cash_register())+str(Checkout.get_total_cost()))
        case 0:
            break






