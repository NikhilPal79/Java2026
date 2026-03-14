# FACTORY [ that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.]
Instead of:
────────────
YOU decide which class to create → new Dog(), new Cat()

Factory Pattern:
─────────────────
YOU tell factory WHAT you want → factory decides WHICH class to create

STEP 1 :[CREATE INTERFACE ]
STEP 2 :[CREATE 2,3 CONCRETE CLASSES IMPLEMENTS  ]
STEP 3 :[CREATE FACTORY CLASS ]
STEP 4 :[CREATE CLIENT USES FACTORY CLASS ]


# MOSTLY WE USE THIS ONE IN JAVA , SPRING BOOT 

# Design Principles Factory Follows
1. Single Responsibility [Factory class has ONE job — create objects]

2. Open / Closed Principle [Open for new animals (add Lion)] [Closed for modification (don't change client)]

3. Dependency Inversion [Client depends on Animal interface] [NOT on Dog, Cat, Cow directly]
