# this  → refers to the CURRENT class object
# super → refers to the PARENT class object



# ⚠️ Important Rules
Rule                                   this                       super
Must be first line in constructor      ✅                          ✅
Can use together in same constructor   ❌ Only one                 ❌ Only one
Usable in static methods               ❌                          ❌
Calls constructor                      this()                      super()
Access field                           this.field                  super.field
Call method                            this.method()               super.method()
