import java.lang.Thread;
import java.util.Random;
import java.util.concurrent.*;

public class MultiThreading extends Thread {

    public static Thread thread;
    public static MultiThreading event2;
    private static String APPROVED = "Approved";

    public static void DoPrint(Base o) {
        o.print();
    }

    @Override
    public void run() {
    }

    static class Task implements Callable<Integer> {

        private static TimeUnit SECONDS;
        private static AbstractExecutorService call;

        @Override
        public Integer call() throws Exception {
            Thread.sleep(100);
            return new Random().nextInt();
        }

        public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
//********************************Valid Exception********************************
            ExceptionHandling c = new ExceptionHandling();
            int threads = 10;
            for (int i = 0; i < threads; i++) {
                MultiThreading get = new MultiThreading();
                System.out.println("Thread started");
                get.start();
                get.checkAccess();
                System.out.println("Thread is running");
            }
            System.out.println("Thread stopped");


            // start the thread and run the thread********************************
            event2 = new MultiThreading();
            thread = new Thread(event2);
            System.out.println("State of thread1 after calling .start() method on it - " + thread.getState());
            event2.run();
            thread.start();
            System.out.println("State of thread1 after calling .getState() method on it - " + thread.getState());
//exception with threading********************************
        /*    Sender send = new Sender();
            ThreadSend newThreadSending = new ThreadSend(send, "Hi");
            ThreadSend newThreadSending1 = new ThreadSend(send, "Bye");
            newThreadSending.start();
            newThreadSending1.start();
            try {
                newThreadSending.join();
                newThreadSending1.join();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
//Divideby Zero Exception
            try {
                int result = c.divideBtZero(12, 0);
            } catch (ArithmeticException e) {
                System.out.println("Valid Exception Handler");
            }
            new Thread(new Base.Two(), "gfg1").start();

            //Executor Service --- start thread
            Thread first = new Thread(new ExecutorServiceTest());
            System.out.println(first);
            first.start();
            System.out.println(Thread.currentThread().getPriority() + "\n" + Thread.currentThread().getState());
//Fixed pool because of limited tasks
            int n = 10;
            synchronized (first) {
                for (int i = 0; i < n; i++) {
                    Thread forloop = new Thread(new ExecutorServiceTest());
                    forloop.start();
                    System.out.println(Thread.currentThread().getState());

//threadpool is thread safe
                    ExecutorService fixedpool = Executors.newFixedThreadPool(10);
                    for (i = 0; i < 3; i++) {
                        fixedpool.execute(new ExecutorServiceTest());
                    }
                    System.out.println("fixed pool state " + Thread.currentThread().getState());

                    ExecutorService cachedpool = Executors.newCachedThreadPool();
                    n = 5;
                    try {
                        for (i = 0; i < n; i++) {
                            cachedpool.execute(new ExecutorServiceTest());
                        }
                        System.out.println("cached pool state " + Thread.currentThread().getState());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
//for scheduling tasks
                    ScheduledExecutorService scheduledpool = Executors.newScheduledThreadPool(10);
// task run after 10 sec dealy
                    scheduledpool.schedule(new ExecutorServiceTest(), 10, SECONDS);
//task run repeatedly after 10 sec with initial delay of 15 seconds
                    scheduledpool.scheduleAtFixedRate(new ExecutorServiceTest(), 15, 10, SECONDS);
//task run after previous task is complete
                    scheduledpool.scheduleWithFixedDelay(new ExecutorServiceTest(), 10, 5, SECONDS);
//initiate shutdown
                    scheduledpool.shutdown();
                    scheduledpool.isShutdown();
                    scheduledpool.isTerminated();
                    scheduledpool.shutdownNow();
                    scheduledpool.awaitTermination(10, SECONDS);
                    System.out.println("How many threads are active :" + Thread.activeCount() + "\n Current thread  " + Thread.currentThread().getState());

//single thread
                    ExecutorService singlethread = Executors.newSingleThreadExecutor();
                    singlethread.execute(new ExecutorServiceTest());
                    while (true) {
                        System.out.println("using this while loop to complete task" + Thread.currentThread().getState());
                    }

                }
            }
        }
//creating a fixed pool
        //submit tasks and getting result to future
                  /*  Future<Integer> future = call.submit(new Task());
                    Integer value = future.get(1, SECONDS);
                    System.out.println("callable : " + value + Thread.currentThread().getState());
                    System.out.println("How many threads are active :" + Thread.activeCount());
*/
//lambda raw thread to start task
/*                    Thread t1 = new Thread(() -> ExecutorServiceTest.bookseat());
                    t1.start();
                    System.out.println("state : " + Thread.currentThread().getState());
                    System.out.println("How many threads are active :" + Thread.activeCount());
                    Thread t2 = new Thread(() -> ExecutorServiceTest.bookseat());
                    t2.start();
                    Thread t3 = new Thread(() -> ExecutorServiceTest.bookseat());
                    t3.start();
                    System.out.println("How many threads are active :" + Thread.activeCount());
                }
            }
        }*/

        public void run() {
            try {
                System.out.println("Running current thread name:" + Thread.currentThread().getName());
                System.out.println("Running current thread id:" + Thread.currentThread().getName() + "is running");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Exception is caught");

            }
        }

        public void event2() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread one");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        static class Sender {
            public void sending(String msg) {
                System.out.println("Sending message" + msg);
                try {
                    Thread.sleep(22);
                } catch (
                        Exception e) {
                    e.printStackTrace();
                }
                System.out.println("sent message" + msg);
            }
        }

        static class ThreadSend extends Thread {
            String msg;
            Sender sender;

            public ThreadSend(Sender send, String m) {
                msg = m;
                sender = send;
            }


            public void run() {
                synchronized (sender) {
                    sender.sending(msg);
                }
            }


        }
    }
}
