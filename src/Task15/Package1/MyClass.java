package Task15.Package1;

public class MyClass {
    int myDefaultVariable = 42;
}

/*However, when we try to access the "myDefaultVariable" variable from the "MyClass" instance,
 we get a compile-time error because the variable has default (package-private) access and cannot be accessed
 from outside the package where it was defined.*/