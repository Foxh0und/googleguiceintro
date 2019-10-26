# Asking Guice to create Singleton Objects
When you inject, you create a new instance of the object, however, you may want a singleton, injecting the same instance of the object wherever you need it.

To fix this, in your binding, you specify with .in(Scopes.SINGLETON) that the object must be a singleton.