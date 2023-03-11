package accessPublicMethodSamePackage;

public class MyClass {
    public void myPublicMethod() {
        System.out.println("This is a public method.");
    }

    void myPackageMethod() {
        myPublicMethod();
    }

    public static void main(String[] args) {
        MyClass myClaassObject= new MyClass();
        myClaassObject.myPackageMethod();
    }
}

