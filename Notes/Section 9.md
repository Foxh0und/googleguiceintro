# Creating Complex Methods with the Provides annotations.
When you need code to create an object, use an @Provides method. The method must be defined within a module, and it must have an @Provides annotation. The method's return type is the bound type. Whenever the injector needs an instance of that type, it will invoke the method.

You can use the Singleton method along with provides to create singleton objects.

You can also mix bindings to give provides methods injected values with annotations. 

If we need multiple methods to inject an interface with many implementations, we can use annotations to tag our @provides methods.