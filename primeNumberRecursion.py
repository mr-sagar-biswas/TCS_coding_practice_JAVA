def isprime(n,i):
    if n==i:
        return True
    elif n%i==0:
        return False
    else:
        return isprime(n,i+1)


print(isprime(971,2))
        
