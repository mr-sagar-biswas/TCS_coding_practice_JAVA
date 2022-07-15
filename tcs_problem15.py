def substrings(string):
    substring=[]
    for i in range(len(string)):
        for j in range(i+1,len(string)+1):
            substring.append(string[i:j])
    substring=list(set(substring))
    substring.sort()
    return substring



string=input()
for items in substrings(string):
    print(items)
