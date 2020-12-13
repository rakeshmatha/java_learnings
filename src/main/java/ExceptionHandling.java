import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.AsynchronousCloseException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ExceptionHandling extends Exception {
    public int accountno[] = {1001, 2001, 3001, 4001};
    public String name[] = {"nick", "harry", "john", "legend"};
    public float balance[] = {1001, 2001, 3001, 4001};

    public ExceptionHandling() {
    }

    public ExceptionHandling(String s) {
        super(s);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        //********************************CheckedException********************************
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello Geeks");

        int x = 0;
        int y = 10;
        int z = y / x;

        FileReader open = null;
        try {
            open = new FileReader("/Users/rakeshmatha/IdeaProjects/learn/Help.md");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader fileload = new BufferedReader(open);
        try {
            for (int i = 0; i < 3; i++)
                fileload.readLine();
            fileload.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //********************************out of bound********************************
        int[] arr = new int[5];
        int i = arr[5];
        System.out.println("What happened");


//********************************Multi catch with finally********************************
        int xx=10; int yy=10;
        if(xx==yy) {
            try{
                throw new Exception();
            }
            catch (ExceptionInInitializerError e){
                System.out.println("ExceptionInInitializerError");
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("The program terminates now");
            }
        }

//********************************null pointer********************************
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }

    //********************************userdefined exception********************************

/*        try {
        for (int i = 0; i < 4; i++) {
            System.out.println(accountno[i] + "\t" + name[i]  + "\t" + balance[i]);
            if (balance[i] < 1000) {
                ExceptionHandling e= new ExceptionHandling("Account Balance is less than the expected amount.");
                System.out.println(e);
                try {
                    throw e;
                } catch (ExceptionHandling exceptionHandling) {
                    exceptionHandling.printStackTrace();
                }
            }
        } }*/


    int divideBtZero(int a, int b) {
        a = 10;
        b = 0;
        int z = a / b;
        return z;
    }

    int tryCatch() {
        int result = 0;
        try {
            result = divideBtZero(10, 0);
        } catch (NumberFormatException exception) {
            System.out.println("AsynchronousCloseException Exception is not valid handler");
        } finally {
            System.out.println("Finally this lock is called");
        }
        return result;

    }
}