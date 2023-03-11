package ProtectedExample;

public class MySubclass extends MyClass {
    public void myPublicMethod() {
        myProtectedMethod();
    }

    public static void main(String[] args) {
        MySubclass subclassObject= new MySubclass();
        subclassObject.myPublicMethod();
    }

}

    /* What happens when we try to call the protected method from the subclass
  depends on where the subclass is located in relation to the superclass. If the subclass is defined in the same
 package as the superclass, then the protected method can be accessed from the subclass.
 However, if the subclass is defined in a different
package than the superclass,then the protected method cannot be accessed from the subclass.*/