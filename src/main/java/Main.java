import java.util.concurrent.Callable;

public class Main implements Callable {
    public static class S {
        public static void P(String s) {
            System.out.println(s + "\n");
        }
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
    static class Test
    {
        // static variable
        static int a = m1();

        // static block
        static {
            System.out.println("Inside static block");
        }

        // static method
        static int m1() {
            System.out.println("from m1");
            return 20;
        }

        public static void main(String[] args) {
        S.P("Welcome to Learning Phase");
        //static variables blocks are classes level. they will implement first of all if you want some function before program start. we will keep them in static
        Static.common();
        m1();
        }
}
}