package staticMember;

public class StaticInnerClass {
        static void outerShow()
        {
                System.out.println(" Ouert show");
        }
        static class InnerClass{
                static void InnerShow()
                {
                        System.out.println(" Inner show");
                }
        }

        public static void main(String[] args) {
                StaticInnerClass.outerShow();
                StaticInnerClass.InnerClass.InnerShow();
        }
}