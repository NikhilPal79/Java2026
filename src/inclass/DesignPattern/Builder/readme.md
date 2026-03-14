# BUILDER [that lets you construct complex objects step by step instead of passing everything in one constructor]

# EXAMPLE
// What if Employee has many fields?
public class Employee {
public Employee(int id) { }
public Employee(int id, String firstName) { }
public Employee(int id, String firstName, String lastName) { }
public Employee(int id, String firstName, String lastName, double salary) { }
public Employee(int id, String firstName, String lastName, double salary, String dept) { }
public Employee(int id, String firstName, String lastName, double salary, String dept, int age) { }
#  [keeps growing!] 😱

# Calling it — CONFUSING! what is each value?
Employee emp = new Employee(1, "nikhil", "p", 60000.0, "IT", 25);
//                          ↑     ↑       ↑     ↑        ↑    ↑
//                     no idea what each param means!

# What Builder Pattern Solves
✅ Readable — you know what each value means
✅ Immutable — object cannot be changed after build()
✅ Optional fields — skip fields you don't need
✅ Step by step construction
✅ Single complete object — no half-built states

# SAME BUILDER USED IN STREAM WITH LAMBORK [using annotation @DATA, @BUILDER, @ALLARGSCONSTRUCTOR]