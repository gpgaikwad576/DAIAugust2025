accounts={}
def create_account(name,balance):
    accounts[name]=balance
    print("Customer Added Successfully")


def deposite(name,amount):
    if name in accounts:
        accounts[name] += amount
    else:
        print("User Not Found")

def withdraw(name,amount):
    if name in accounts:
        accounts[name] -= amount
    else:
        print("User Not Found")

def check_balance(name):
    if name in accounts:
        print(f"{name},balance:{accounts[name]}")

def transfer_money(sender,receiver,amount):
    state=False
    if accounts.get(sender,None)!=None:
        if amount<=accounts[sender]:
            accounts[sender]-=amount
            state=True
        else:
            print("Sorry Can't transfer Money, Insufficient Balance!")
        if  accounts.get(receiver,None)!=None and state:
            accounts[receiver]+=amount

    if state:
        print("Successful:")

def display_name(name):
    if name in accounts:
        print(name)





