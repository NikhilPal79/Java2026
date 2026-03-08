# COLLECTION [60% INTERVIEW ]

A. LIST<> [ARRAY LIST] [ LINKEDLIST]

# ARRAY LIST [INTERNALLY ITS BACKEND BY ARRAY ][ ITS DYNAMIC IN NATURE ]
1. elements are stored in order of insertion 
2. it also allows duplicate elements 
3. null is also supported.

int[] arr = new int[5]; // size = 5

# Internal Implementation of arraylist

# In Java 7
IF YOU CRAETE LIST LIKE [List list = new ArrayList<>();] [a default array of size 10 is created ] [ threshold / Load Factor. : 75% 75 % full]

need to create a new array of size
10 + 10/2 + 1     = 16
n + n/2 + 1 [new array of size 16 is created.]

if we know the size = [array]
if we don't know the size , it's going to grow dynamically = [arraylist]

# IN JAVA 8 
 IF YOU CREATE LIST LIKE [ List<Integer> = new ArrayList<>();] [Lazy Initialization of arrayList][V.IMP][INTERVIEW ]
1. array of size 0 is created.
2. when you insert the first element
3. then an array of size 10 will be created.
4. memory saved 


## LINKEDLIST
1. SINGLY [element and address of next node]
2. DOUBLY [ address of previous node, element, address of next node]

# COMPARE BETWEEN ARRAYLIST AND LINKED LIST [ IN 1 MILLION ]
1. FOR SEARCH / READ OPERATION [ARRAY LIST IS BETTER, BCZ LINKED LIST DON'T HV INDEX]
2. INSERTION / DELETION OPERATION [LINKED LIST IS BETTER,BCZ WE ONLY DO ONE OPERATION AS ARRAY LIST ZERO INDEX MOVE TO 1ST AND SO ON ]