# DESIGN PATTERN 
Design patterns are typical solutions to commonly occurring problems in software design. 
They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.

# WHY THERE IS A NEED OF DESIGN PATTERN ?
1. Design patterns are a toolkit of tried and tested solutions to common problems in software design.


# TYPE OF DESIGN PATTERN 
1. CREATIONAL [ provide object creation mechanisms that increase flexibility and reuse of existing code.]
2. STRUCTURAL [explain how to assemble objects/classes into larger structures, while keeping structures flexible and efficient.]
3. BEHAVIORAL [take care of effective communication and the assignment of responsibilities between objects.]


1. SINGLETON[CDP that lets you ensure that a class has only one instance, while providing a global access point to that instance.]
# WHERE TO USE[ use it for shared resources like DB connections where creating multiple instances would waste memory or cause inconsistency!] 
Normal Class:
──────────────
MyClass obj1 = new MyClass();  // new instance
MyClass obj2 = new MyClass();  // another new instance
MyClass obj3 = new MyClass();  // another new instance
obj1 ≠ obj2 ≠ obj3  → 3 different objects

Singleton Class:
─────────────────
MyClass obj1 = MyClass.getInstance();  // same instance
MyClass obj2 = MyClass.getInstance();  // same instance
MyClass obj3 = MyClass.getInstance();  // same instance
obj1 == obj2 == obj3  → ALL point to ONE object ✅

1. DATABASE CONNECTION
   ────────────────────────
   ❌ Without Singleton:
   Every class creates its own DB connection
   → 100 classes = 100 connections
   → wastes memory, crashes database!

✅ With Singleton:
ONE connection shared across entire app
→ 100 classes = 1 connection
→ efficient and safe!

# THREE RULES OF SINGLETON 
Rule 1 → [Private constructor] [nobody can do new MyClass()]

Rule 2 → [Private static instance] [(only one instance inside class)]

Rule 3 → [Public static getInstance()] [(only way to access the instance)]






