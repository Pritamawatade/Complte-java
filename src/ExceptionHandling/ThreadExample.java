package ExceptionHandling;

public class ThreadExample implements Runnable {
    public void run(){
        for(int i = 0; i <10; i++){
            System.out.println("Thread " + i );
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("some error occurred");
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample example1 = new ThreadExample();
        Thread example = new Thread(example1);
        example.start();


    }
}
