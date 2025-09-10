# Print grade of student based on his marks (e.g. 76 is DISTINCTION 54 is SECOND CLASS 41 is PASS CLASS)

marks=int(input("Enter the Number:"))
if marks>=76:
    print("DISTINCTION")
elif marks>=54 and marks<76:
    print("SECOND CLASS")
elif marks>=41 and marks<54:
    print("PASS CLASS")

else:
    print("FAIL")


