# STREAM METHOD [maintain order of insertion ]
1. generate 

# DIFFERENCE IN PARALLEL.STREAM AND SEQUENTIAL STREAM 
1. SEQUENTIAL STREAM [MAINTAIN THE DATA][REASON = processes elements one by one in order on a single thread.][FOR SMALL DATASET]
2. PARALLEL.STREAM [DOES NOT MAINTAIN THE DATA][REASON = splits data across multiple threads simultaneously for faster processing]
[ but order is not guaranteed and requires thread-safe operations!][USED FOR LARGE DATA[TO FIX FOR EACH ORDERED] ]


# DESIGN PATTERN [][why there is need ?]
1. CREATIONAL =>[SIGNLETON DP][ABSTRACT FACTORY][BUILDER]
2. STRUCTURAL =>[FACADE][PROXY]
3. BEHAVIORAL =>[][][]


# generate csv, to process data 


# METHOD REFERENCE OPERATOR [DENOTED BY => ::][]
1. STATIC [class :: method name ][no need to create object class ]
2. NON-STATIC [class :: method name] [need to create object of class ]

# Stream.generate [calls the supplier repeatedly][always use .limit()====> without it it runs forever]


# OPTIONAL [prevents null pointer exception by wrapping a value that may or may not exist]
[CAN SEND EMPTY[IF STREAM IS EMPTY] OR NON EMPTY[IF STREAM IS NOT EMPTY]]
1. FIND ANY 
2. FIND FIRST 


# 4 STATIC METHOD OF OPTIONAL
1.
2.

giving null is not an exception  
but null.Something is exceptional

# Optional is a container that either:
Optional<String> hasValue  = Optional.of("nikhil");     // ✅ contains value
Optional<String> noValue   = Optional.empty();           // ❌ contains nothing
Optional<String> maybeNull = Optional.ofNullable(null);  // ⚠️ might be empty

# SUMMARY 
Use Optional in streams to safely handle cases where
a stream operation might not find a result
instead of returning null and risking NullPointerException!
