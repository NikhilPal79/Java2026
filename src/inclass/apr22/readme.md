# practical of hashmap and equal

# CLASS AS KEY IN MAP 
1. override the hashCode and equals method 
2. make class immutable

[ HOW TO MAKE CLASS IMMUTABLE 100% ]


# HOMEWORK 
1. what if no hashcode how equal works if we run put method.
2. what if no equal how hashcode works f we run get method.
3. don't override any of the methods how put and get method going to behave.



# then HashMap stores entries based on hashCode at the time of put().If the key mutates and hashCode changes then  
# get() searches in a different bucket and finds nothing — returning null



