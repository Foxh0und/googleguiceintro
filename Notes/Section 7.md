# Ways of Injection

There are three types of injectors.

- Constructor Injection: Injecting via the Constructor
- Setter Injection: Injecting via a function
    When annotating a function with Inject, it will call that function and inject the object.
- Field Injection
    Injecting the field itself, add the annotation to the field.

When creating annotations, you can specify what annotations are allowed to target with @Target.