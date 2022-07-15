first=list(input())
second=list(input())
third=input()
thrid=third.upper()
vowels=["a","e","i","o","u"]
numbers=list(map(str,range(10)))
for i in range(len(first)):
    if first[i] in vowels:
        first[i]="*"
for i in range(len(second)):
    if second[i] not in vowels:
        if second[i] not in numbers:
            second[i]="@"
print("".join(first)+"".join(second)+third)
