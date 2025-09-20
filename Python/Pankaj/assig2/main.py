from itertools import zip_longest

# 1.Write a function to add n numbers
def add(*args):
    sum=0
    for w in args:
        sum+=w
    return sum

# 2. Write a function to take two parameters first is list second is int n e.g performAction(mylist,n)
# create new list after every nth element from mylist
def  split_list(lst, n):
    t=n
    lst2 =list()
    temp =[]
    for i in range(len(lst)):
        temp.append(lst[i])
        t-=1
        if t==0 :
            lst2.append(temp)
            t=n
            temp = []

    if(t!=0): lst2.append(temp)
    return lst2




# 3. Take two string lists (namelist, surnamelist) as parameters for a function and final output should
# be like
# [name1 surname1, name2 surname2.....]
def combine_strings(namelist,surnamelist):
    lst2=[]
    for name,surname in zip_longest(namelist,surnamelist):
        if surname is None:
            surname =""
        else:
            surname = " "+surname
        lst2.append(f"{name}{surname}")
    return lst2


# 4. Write a function to seperate elements from given iterable (list, tuple, set) and create 3 different
# lists for oddnumber, even numbers and prime numbers
def separate_elements(iterable):
    def isprime(num):
        if(num == 1): return False
        if(num == 2): return True
        for i in range(2,num//2+1):
            if(num % i == 0): return False
        return True

    oddnums,evennums,primenums =[],[],[]
    if len(iterable) == 0:  return [],[],[]

    for num in iterable:
        if(num % 2 != 0): oddnums.append(num)
        if(num % 2 == 0): evennums.append(num)
        if(isprime(num)): primenums.append(num)

    return oddnums,evennums,primenums


if __name__ =="__main__":
    sn ,sn2 =2,3
    print(f"Addition of numbers {sn} and {sn2}: {add(sn,sn2)}")

    arr,n=[1,2,3,4,5,6,7],2
    print(f"Split of array {arr} and split {n}: {split_list(arr,n)}")
    print()
    arr,arr2 = ["Pankaj","Anurag","Manish"],["Gaikwad","Sahu"]
    print(f"Combination of strings {arr} and {arr2}: {combine_strings(["Pankaj","Anurag","Manish"], ["Gaikwad","Sahu"])}")
    print()
    print(f"Separate elements of an array,list passed :{separate_elements([1,2,3,4,5,6,7,8,9])}")
    print()
    print(f"Separating elements array,list passed :{separate_elements([1, 2, 3, 4, 5, 6, 7, 8, 9])}")
    print()
    print(f"Separating elements array,tuple passed :{separate_elements((1, 2, 3, 4, 5, 6, 7, 8, 9))}")
    print()
    print(f"Separating elements array,set passed :{separate_elements({1, 2, 3, 4, 5, 6, 7, 8, 9})}")


