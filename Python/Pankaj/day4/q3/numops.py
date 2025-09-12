def getOdds(lst):
    return list(filter(lambda n:n%2!=0,lst))

def makeSquare(lst):
    return list(map(lambda n:n**2,getOdds(lst)))
    