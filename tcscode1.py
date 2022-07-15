n=int(input())
length=10
x=0
y=0
for i in range(0,n):
    if i%5==0:
        x=x+length
    if i%5==1:
        y=y+length
    if i%5==2:
        x=x-length
    if i%5==3:
        y=y-length
    if i%5==4:
        x=x+length
    length=length+10
print(x,y)
