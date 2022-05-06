package staticMember;
public class StaticTest extends  testBase{
    public static int iStatic = 10;
    public void nonStatic() {
        System.out.println("can access static variable inside non-static method : " + iStatic);

    }
    public static void main(String[] args)
    {
        System.out.println("Inside main method");


    }
}

class testBase
{
    static int staticVar = 100;
    public void checkStatic() {
        System.out.println("can access static variable inside non-static method : " + staticVar);

    }
}