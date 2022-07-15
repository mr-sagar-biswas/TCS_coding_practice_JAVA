def power(x,n):
    if n>=0:
        if n>0:
            return x*power(x,n-1)
        else:
            return 1
    else:
        return 1/power(x,abs(n))
    
x=int(input())
n=int(input())
print(power(x,n))
