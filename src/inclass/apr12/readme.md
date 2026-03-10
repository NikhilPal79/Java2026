# NODE CONTAINS 4 BLOCK [HASH][KEY][VALUE][NEXT ADDRESS OF NODE]

# INTERNAL WORKING OF HASHMAP
hashmap is an array of linked list of node, in which node contains 4 values
1. hash code
2. key 
3. value 
4. address of next node

let's suppose we make an entry of s1(key1, value1), so the asci value will be multiplied by prime number[they distribute values more evenly across the hash space]
followed by some arithmetic operation to calculate the Hashcode by formula, whenever we call put(s1(key1, value1)) 
{
hash = hashCode(k) = eg 512

index = hash&(n-1) = eg 5 [can be any number, no centrally 5 ] 
}
we calculated two value 1st = hashcode and 2nd = index, on the basic of index, we stored  in the 5th bucket of array list, 
in the 5th bucket we  store our node with 4 values [512, key1, value1, null][null bcz there is no other node is there],

CASE 1: [V.IMP][HASH COLLISION]

what if we put with different entry s2 (key2, value2)
{
hash = hashCode(k) = eg= 512

index = hash&(n-1) = eg 5 
}
but we get the same hashcode in the 5th bucket than we compare the key with method  
{
method = .equal() = false 
} 
then this value is also stored in the 5th bucket, behind the above node with [512, key2, value2, null], but the 1st node value will change to[512, key1, value1, 512]

case 2: 

what if the [.equal method ] = true, that means the keys and hashCode have the same value as that previous value will be overwritten 


# JAVA 8 

in java 8,
hashMap replaces the linked list with a binary tree when the number of elements in a bucker reaches a certain threshold.
While converting the 
list to binary tree, hashCode is used as a branching variable.
If there are two diff hashcode in the same bucket, one is considered bigger and goes
to right of the tree and the other one goes to left, But when both the hashcode are equal,
HashMap assumes that the keys area is comparable, and compares the 
key to determine the direction so that some order can eb maintained.









