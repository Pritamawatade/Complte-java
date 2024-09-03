package Threading;

public class Thread1  extends Thread{

    public Thread1(String thread_name){
        super(thread_name);
    }

    @Override
    public void run(){
            System.out.println("Thread 1 " + Thread.currentThread()); // will print the thread name and  thread pripority and thread parent
    }
}
