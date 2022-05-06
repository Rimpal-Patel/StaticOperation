package staticMember;

class FirstClass {

    public static void method1()
    {
        System.out.println("Method-1 of the First class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the First class is executed.");
    }
}
//child class
public class MethodHidingOperation extends FirstClass {
    public static void method1() {
        System.out.println("Method-1 of the MethodHidingOperation class is executed.");
    }

    public void method2() {
        System.out.println("Method-2 of the MethodHidingOperation class is executed.");
    }

    public static void main(String args[]) {
        FirstClass d2 = new MethodHidingOperation();
//d2 is reference variable of class Demo that points to object of class Sample
        FirstClass d1 = new FirstClass();
//method calling with reference (method hiding)
        d1.method1();
        d2.method1();
//method calling with object (method overriding)
        d1.method2();
        d2.method2();
    }
}
