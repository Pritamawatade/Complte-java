package Threading;

 class ABC implements Runnable {

    public void run() {

        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of the thread t1 while it invoked the method join  on Thread t1 " + ThreadState.t1.getState());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

class ThreadState implements Runnable {
    static Thread t1;
    static ThreadState obj;

    public static void main(String[] args) {
        obj = new ThreadState();
        t1 = new Thread(obj);

        System.out.println("The state of the t1 after spawning it is " + t1.getState());
        t1.start();
        System.out.println(" The state of the t1 after starting it "+ t1.getState());
    }

    public void run(){
        ABC myobObj = new ABC();
        Thread t2  = new Thread(myobObj);

        System.out.println("The state of the t2 after spawning it is " + t2.getState());
        t2.start();

        System.out.println("The state of the t2 after starting it "+ t2.getState());

        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("The state of the t2 thread after invoking the sleep method on it "+ t2.getState());

        try{
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The state of the t2 thread after invoking the join method on thread join() on Thread " + t2.getState());
    }
}