package Task15.Package2;

public class MyOtherClass {
    public void myMethod() {
        MyClass obj = new MyClass();
        int value = obj.myDefaultVariable;
        System.out.println("The value is: " + value);
    }
}


/*However, when we try to access the "myDefaultVariable" variable from the "MyClass" instance,
 we get a compile-time error because the variable has default (package-private) access and cannot be accessed
 from outside the package where it was defined.*/