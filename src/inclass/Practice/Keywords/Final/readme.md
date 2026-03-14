# FINAL [The final keyword means "cannot be changed"]

final variable  → [value cannot be changed (constant)]
final method    → [cannot be overridden in subclass]
final class     → [cannot be extended (no subclass)]


Used                 WithMeaning                              Example
Variable             Value fixed, cannot reassign             final int MAX = 100
Method               Cannot be overridden                     final void show()
Class                Cannot be inherited                      final class String
Parameter            Cannot reassign inside method            void add(final int x)
Reference            Reference fixed, object can change       final List list = new ArrayList()