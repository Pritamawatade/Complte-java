package Thread;

public class Thread1  extends Thread{

    public Thread1(String thread_name){
        super(thread_name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Theard 1 "+Thread.currentThread()+ i); // will print the thread name and  thread pripority and thread parent
        }
    }
}
