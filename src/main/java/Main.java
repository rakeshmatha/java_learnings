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

    public static void main(String[] args) {
        S.P("Welcome to Learning Phase");
    }
}