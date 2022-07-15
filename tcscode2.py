"""
x=input()
number=0
letters={"A":10,"B":11,"C":12,"D":13,"E":14,"F":15,"G":16}
for i in range(len(x)):
    if x[i] in letters.keys():
        n=letters[x[i]]
    else:
        n=int(x[i])
    number=number+n*(17**(len(x)-1-i))
print(number)

"""
x=input()
print(int(x,17))
