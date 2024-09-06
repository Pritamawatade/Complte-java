package Threading;

public class NameingAThread extends Thread{
    public NameingAThread(){
    }

    public NameingAThread(String name){
        super(name);
    }
    public void run(){

        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        NameingAThread n = new NameingAThread();
        NameingAThread n1 = new NameingAThread("Thread 2");
        n.start();
        n1.start();
        n.setName("Thread 1");
        System.out.println(n.getName());
        System.out.println(n1.getName());
    }
}
