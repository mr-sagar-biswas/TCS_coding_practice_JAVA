def pokemon_wins(pokemon,money,ev_cost,sell_price,low,high):
    mid= (low+high)//2
    if high*ev_cost <= money+((pokemon-high)*sell_price):
        return high
    elif low<=high:
        if mid*ev_cost <= money+((pokemon-mid)*sell_price):
            pokemon_wins(pokemon,money,ev_cost,sell_price,mid+1,high)
        
        if mid*ev_cost > money+((pokemon-mid)*sell_price):
            pokemon_wins(pokemon,money,ev_cost,sell_price,low,mid-1)


print(pokemon_wins(3,10,4,2,0,3))
