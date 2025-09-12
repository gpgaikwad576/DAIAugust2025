from q1 import strutility as m
from q3 import strops as m2
from q3 import numops as m3

def analysetext(str):
    # count no of words
    # no of unique words
    # no of vowels
    # longest word
    # shortest word
    # most common length word
    return [m.countwords(str),m.cntuniquewords(str),m.countvowels(str),m.getLongestWord(str),m.getShortestWord(str),m.getCommonWord()]

print("Q1 implementation")
str = input("Enter string for Q1: ")
lst = analysetext(str)
print("count of words in the sentence: ",lst[0])
print("Count of unique Words: ",lst[1])
print("Count of Vowels: ",lst[2])
print("Longest word in the sentence: ",lst[3])
print("Shortest word in the sentence: ",lst[4])
print("Commonly appearing word sentence: ",lst[5])

str = input("Enter string for Q3: ")
print(m2.filterPalind(['tenet','mango','eye','apple']))
print(m2.filterchardupli(['tenet','mango','eye','apple']))
print(m2.applySwapCase(['Tenet','mango','Eye','apple']))
print(m3.makeSquare([1,2,3,4,5,6,7]))