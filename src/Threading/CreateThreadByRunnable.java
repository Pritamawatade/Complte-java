package Threading;

public class CreateThreadByRunnable implements Runnable {
    public void run() {
        System.out.println("Thread 3 " + Thread.currentThread());
    }
}
