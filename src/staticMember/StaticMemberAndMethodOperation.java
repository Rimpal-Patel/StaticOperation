package staticMember;

public class StaticMemberAndMethodOperation {
    static  String staticVar= "hello";
    static {
             System.out.println(" static block of main class");
           }
    public static void main(String[] args) {
    System.out.println(" main block called");
    Student s1= new Student(1,"Nishit");
    Student.dispayStatic();
    s1.display();


    }
}

class Student{
    static String collegeName;
    int rollNo;
    String name;
    Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }
    static {
            collegeName = "GTU";
             System.out.println(" static block called");
    }
    {
        System.out.println("simple block");
    }
    static void dispayStatic()
    {
        System.out.println(" static member is==>"+collegeName);

    }

    void display()
    {
        System.out.println(" Nonstatic member are==>"+collegeName);

    }
}



