package Threading;

public class AllAboutJoinMethod extends Thread{
    public void run(){
        for (int i = 0; i < 3 ; i++) {

            try{
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println("Exception accursed");
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        AllAboutJoinMethod t1 = new AllAboutJoinMethod();
        AllAboutJoinMethod t2 = new AllAboutJoinMethod();
        AllAboutJoinMethod t3 = new AllAboutJoinMethod();

        t1.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted because of InterruptedException ");
        }
        t2.start();
        try {
            t2.join(300); // it means that t2 Thread will get 300 milliseconds to execute
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
       t3.start();


    }

}
