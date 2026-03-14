# Thread.sleep();--->  [interrupted Exception ]


# final vs finally vs finalize 

# finalize [ method in java which is used to resource clean up, used by Garbage collector ]


# INNER CLASS / NESTED CLASS [When a class defined inside another class. It used as Encapsulation]

1. Local Inner class --- [class inside a method] 
2. Member Inner class --- [class inside a class]
3. Static Inner class - [V.Imp] [static class inside the class][ ofently used in productivity code ]
4. Anonymous Inner class - [V.Imp] [if we need to implenet only one method of each class, we should follow this stratgy, saving memory]


# STATIC [In Java, the static keyword is used to indicate that a method, variable, block, or nested class belongs to the class itself]
[ rather than instances of the class/ does not need object ][non-static method call by creating object]

# ANONYMOUS INTITIALIZATION BLOCK 
An Anonymous Initialization Block (also called Instance Initializer Block) is a block of code { } defined inside a class 
but outside any method or constructor — with no name, no modifier, no return type

static block     → runs ONCE when class loads
instance block   → runs EVERY TIME before constructor
anonymous block  → same as instance block — just another name

# WHY WE USE INSTANCE BLOCK THAN CONSTRUCTOR ?
Anonymous block follows the DRY Principle(Don't Repeat Yourself) —common logic written once,shared by ALL constructors automatically.
While in constructor you have to repeat all code, it would be messy if need to alter the whole constructor



