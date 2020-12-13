import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.String;

class ExecutorServiceTest implements Runnable {
    private static Lock lock = new ReentrantLock();
    private Condition conditionMet = lock.newCondition();

    @Override
    public void run() {
        System.out.println("This is run method overrided and state is  " + Thread.currentThread().getState());
    }

    public void method1() throws InterruptedException{
        lock.lock();
        try {
            conditionMet.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public void method2() throws InterruptedException{
        lock.lock();
        try {
            conditionMet.signal();
        }
        finally {
            lock.unlock();
        }
    }

     static void bookseat(){
        boolean seatAvailable =false;
         try {
             lock.lock();
             for(int i=0;i<3;i++) {
                 System.out.println("Is the current state locked  ? " + Thread.holdsLock(lock) +"\n cuurent thread state " + Thread.currentThread().getState() + "\n current threads " + Thread.activeCount());
             }
         } finally {
             lock.unlock();
             System.out.println("Is the current state locked  ? " + Thread.holdsLock(lock) +"\n cuurent thread state " + Thread.currentThread().getState() + "\n current threads " + Thread.activeCount());
         }
     }
}
