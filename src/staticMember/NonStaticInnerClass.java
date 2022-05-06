package staticMember;

public class NonStaticInnerClass {
    void outerShow()
    {
        System.out.println(" Ouert show");
    }
   class InnerNonStatic{
       void InnerShow()
       {
           System.out.println(" Inner show");
       }
    }

    public static void main(String[] args) {
        NonStaticInnerClass outer= new NonStaticInnerClass();
        outer.outerShow();
        NonStaticInnerClass.InnerNonStatic inner = outer.new InnerNonStatic();
        inner.InnerShow();
    }

}
