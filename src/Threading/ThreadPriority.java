package Threading;

public class ThreadPriority extends Thread{
    public void run(){
        System.out.println("Current Thread = " + Thread.currentThread().getName()+" Priority = "+ Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
