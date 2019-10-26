# Injecting Constant Dependencies
You may need to inject items into constructors.
You can inject constants.

You can bind constants to classes. For example
`bind(Integer.class).toInstance(5);`

This will tell the injecter to bind 5 wherever it encounters Integers. 

However, we may want different values, so we use annotations.
To use annotations, you must make an anotation class, which is annotatetd with @BindingAnnotation