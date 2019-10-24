## A Simple Application to Draw Shapes
Consider an application that will draw an object. Currently, only a square, but it can be extended.

## Internal Design
If we want to make different shapes, it would make sense to use an interface, with many implementations. 

An object that relies is a dependent. The dependency is what it relies on. This can lead to tight coupling.
This can break single responsibilty principle.

### Single Responsibilty Principle
SRP states that every class or module in a program should have responsibilty for just one piece of functionality, and all pieces of that functionality should reside in that class/module.

Despite how simplitic things can seem, instantiting an object is one piece of functionality.

If you are instanting objects inside a class, it makes unit testing difficult.


## Internal Design using Dependency Injection
It is not ideal to construct our dependencies as mentioned, so we can pass them via the constructors. 
If you are not instantiating objects yourself, but outsourcing that too some third party, that's dependency injection.