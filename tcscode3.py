n=input()
evensum=0
oddsum=0
for i in range(len(n)):
    if i%2==0:
        evensum=evensum+int(n[i])
    if i%2==1:
        oddsum=oddsum+int(n[i])
print(abs(evensum-oddsum))
