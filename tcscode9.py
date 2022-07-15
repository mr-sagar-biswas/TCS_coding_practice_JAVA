def fibonacci(n):
    if n==1:
        return 1
    if n==2:
        return 1
    else:
        return(fibonacci(n-1)+fibonacci(n-2))
def isprime(n):
    flag=0
    for i in range(2,n//2+1):
        if(n%i==0):
            flag=1
            break
    if flag==0:
        return True
    else:
        return False

def prime(n):
    count=0
    check=2
    while(count!=n):
        if isprime(check):
            count=count+1
        check=check+1
    return(check-1)
        

n=int(input())
if n%2==0:
    n=n/2
    print(prime(n))
else:
    n=(n+1)/2
    print(fibonacci(n))
