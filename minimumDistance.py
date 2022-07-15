def minimumDistance(a,b,m,n):
    if m==0 or n==0:
        return abs(m-n)
        
    elif a[m-1] == b[n-1]:
        return minimumDistance(a,b,m-1,n-1)
        
    elif a[m-1] != b[n-1]:
        return 1+min(minimumDistance(a,b,m-1,n),minimumDistance(a,b,m,n-1),minimumDistance(a,b,m-1,n-1))

    

a=input()
b=input()

print(minimumDistance(a,b,len(a),len(b)))
