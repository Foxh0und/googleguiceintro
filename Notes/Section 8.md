# Supporting More Shapes
We may have multiple implementations. If we add two bindings to an interface, Guice can't resolve it, so we use annotations.

To avoid making our own annotations, we can use @Named("something");
Bindings take Names.named("something");

The main disadvantage is you may miss match the strings and this can lead to runtime errors.