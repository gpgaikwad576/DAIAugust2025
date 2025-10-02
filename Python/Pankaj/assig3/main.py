
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




