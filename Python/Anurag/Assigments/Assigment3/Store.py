from dessetmgpb import IceCreams,Cookies,Candy,Sundae
import pandas as pd
from collections import defaultdict
class Store:
    cnt=1
    def __init__(self):
        self.id=Store.cnt
        Store.cnt+=1
        self.Items=[]

    def add_items(self,obj):
        self.Items.append(obj)

    def display_cart(self):
        d=defaultdict(list)
        total=0
        for item in self.Items:
            d['product'].append(item.name)
            d['quantity'].append(item.get_quantity())
            d['cost'].append(item.calculate_price())
            total+=item.calculate_price()

        d['product'].append('Total')
        d['quantity'].append('')
        d['cost'].append(total)

        return pd.DataFrame(d)
    


if __name__=="__main__":
    s1=Store()
    while True:
        print("1. Candy\n2. Cookies\n3. IceCreams\n4. Sunde\n5. display cart\n6. Exit!")
        choice=int(input("Enter Your Choice:"))
        match choice:
            case 1:
                name=input("Enter the name:")
                q=float(input("Enter quantity in gms:"))
                s1.add_items(Candy(name,q))
                q=0
                print()
            
            case 2:
                name=input("Enter the name:")
                q=float(input("Enter quantity in units:"))
                s1.add_items(Cookies(name,q))
                q=0
                print()
            
            case 3:
                name=input("Enter the name:")
                q=float(input("Enter quantity in piece:"))
                s1.add_items(IceCreams(name,q))
                q=0
                print()
            
            case 4:
                name=input("Enter the name:")
                q=float(input("Enter quantity in piece:"))
                s1.add_items(Sundae(name,q))
                q=0
                print()
            
            case 5:
                print(s1.display_cart())
                print()
            case 6:
                print("Thank You For Visiting!")
                break
                

