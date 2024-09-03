package Threading;
class CreateThreadWithThreadClass extends Thread {
    public void run(){
        System.out.println(" Thread is running..");
    }
}

class WithRunnable implements Runnable {
    public void run(){
        System.out.println(" Runnable thread is running...");
    }
}
 class AllWaysToCreateThread {
    public static void main(String[] args) {
        CreateThreadWithThreadClass T1 = new CreateThreadWithThreadClass();
        T1.start(); // This is the way to create the thread with Thread class

        Runnable R1 = new WithRunnable();
        Thread T2 = new Thread(R1);
        T2.start(); // This is the way to create the thread with Runnable interface

        // With name Thread but with constructor
        Thread T3 = new Thread("Thread 3");
        T3.start();
        String name = T3.getName();
        System.out.println("Name of the thread is " + name);

        // With name Thread and Runnable interface
        Thread T4 = new Thread(new WithRunnable(), "Runnable Thread 4");
        T4.start();
    }
}
