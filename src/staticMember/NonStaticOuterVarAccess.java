package staticMember;

public class NonStaticOuterVarAccess {
    private static int x = 10;
    private int y;
    NonStaticOuterVarAccess(int y)
    {
        this.y =y;
    }
    void show() {
        System.out.println(" outer x" + x);
        System.out.println(" outer y" + y);
    }

    class inner {
        private int y;

        void show() {
            System.out.println(" inner x" + NonStaticOuterVarAccess.x);
            System.out.println(" inner y" + NonStaticOuterVarAccess.this.y);
        }


    }

    public static void main(String[] args) {
        NonStaticOuterVarAccess o = new NonStaticOuterVarAccess(15);
        o.show();
        NonStaticOuterVarAccess.inner inner = o.new inner();
        inner.show();
    }
}
