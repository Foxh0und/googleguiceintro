# How Guice Builds Objects
When it builds an object, it does two things.
1. Consults binding of type to build concret class.
2. Builds object of that type.

If the type is a concrete class, you can either bind a subclass, or have no binding.