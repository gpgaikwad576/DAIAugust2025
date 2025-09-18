# 1.Write a function to add n numbers
def add(*args):
    sum=0
    for w in args:
        sum+=w
    return sum

# 2. Write a function to take two parameters first is list second is int n e.g performAction(mylist,n)
# create new list after every nth element from mylist
def     split_list(lst, n):
    t=n
    lst2 =list()
    temp =[]
    for i in range(len(lst)):
        temp.append(lst[i])
        t-=1
        if(n==0):
            lst2.append(temp)
            t=n

    if(t!=0): lst2.append(temp)
    return lst2




# 3. Take two string lists (namelist, surnamelist) as parameters for a function and final output should
# be like
# [name1 surname1, name2 surname2.....]
# 4. Write a function to seperate elements from given iterable (list, tuple, set) and create 3 different
# lists for oddnumber, even numbers and prime numbers

if __name__ =="__main__":
    print(split_list([1,2,3,4,5,6,7],2))


