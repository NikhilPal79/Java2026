# ITERATOR

Iterator is an object that lets you traverse a collection
one element at a time without exposing its internal structure


# PROBLEM ITERATOR SOLVES 


# FAIL-FAST Iterator[faster] 
[Immediately throws ConcurrentModificationException if collection is modified during iteration.]

# use 
[iterator.remove() instead]

# FAIL-SAFE Iterator [slower]
[Never throws exception even if collection is modified during iteration] 
[Works on a clone/snapshot of the original collection.]

# use
[CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>()]
[ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();]

