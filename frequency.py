a=[1,2,3,33,3,3,5,5,5,6,7]
b=dict()
for i in a:
    if i not in b.keys():
        b[i]=1
    else:
        b[i]=b[i]+1

for i in b.keys():
    print("{} : {}".format(i,b[i]))
