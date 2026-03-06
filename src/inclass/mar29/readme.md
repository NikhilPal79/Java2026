# WRAPPER CLASSES [all the wrapper classes are in-built classes]


# AUTOBOXING [automatic conversion between primitive types to Object]

# UNBOXING [ object type to integer type ]

# IMMUTABLE CLASSES [V.IMP][we can not change the object, whenever we assign the value it creates the new object in heap memory  ]

# IN ORDER TO GET FULLY IMMUTABLE CLASSES 

1. all the fields should be [private] and [final] 
2. [class] should be [final] 
3. there should be [no setter] methods we should
4. override [equals] and [hashcode] method


# EQUALS() AND HASHCODE() [if two objects are equal, they must have the same hashcode.][hashcode stored in hashtable ]

# INTERNAL IMPLEMENTATION OF HASHMAP - [IMP OF INTERVIEW ]

# COLLECTIONS [The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.]
1. Data structure : how we structure our data for efficient access or storage of data.
2. Its framework for modifying/manipulating objects.
3. It has set of interfaces and classes which are already defined for us.

                            Iterable
                               |
                          Collection [I]
                        |            |               |
                    List[I]        Set[I]        Queue[I]
                        |            |               |
                   ArrayList       HashSet          PriorityQueue
                   LinkedList      TreeSet 
                                   LinkedHashSet



                             Map[I]
                               |
                            HashMap

 STACK IS ALSO COLLECTION
 

# UTILITY CLASSES 
1. Arrays [C]
2. Collections [C]


# TYPE SAFETY [IMP]
1. Type safety means that a program prevents type errors at compile time by ensuring that variables,
2. methods, and data structures only hold and operate on the correct types.

# GENERICS [denoted by <_>] [Introduced to have type-safety in Java collections.][completes the both situation]
1. typesafe 
2. flexibility to work with any type [Object instead of String/int/float]


