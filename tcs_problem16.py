def pytho_triplets(limit):
    c=0
    m=2
    while c<limit:
        for n in range(1,m):
            a=m*m-n*n
            b=2*m*n
            c=m*m+n*n
            if c<=limit:
                print(a,b,c)
        m=m+1

limit=int(input())
pytho_triplets(limit)
