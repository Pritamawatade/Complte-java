package Threading;

public class Main {
    public static void main(String[] args) {

        CreateThreadByRunnable runnableThread = new CreateThreadByRunnable();
        runnableThread.run();


        System.out.println("main is thread is staring......");
        Thread thread1 = new Thread1("thread 1 ");
        thread1.setDaemon(false); // In summary, the key difference between threads and daemon threads is that non-daemon threads are
//                                  terminated only when they finish their tasks, while daemon threads are terminated when the main program exits, regardless
//                                   of whether they have finished their tasks or not.
        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "Thread 2"); // second paramter is optional it's name of the thread
        thread2.start();
        System.out.println("main thread is dying............");
        Producer_Consumer_problem p = new Producer_Consumer_problem(3);
        p.add(12);
        p.remove();
        p.remove();
    }

}

//SYNCHRONIZATION :- SO basically synchronization is the  correct way of order the executaion of threads so that we don't
//                  get in to the state like the deadlock and all that. To get started we just
//                  have to create an synchronized block and we have pass the object to that block now only thread that
//                  have access to that object will be able to get executed parallel. You can pass 'this' object to the that block.
//                  Now talk about the static method
//                  how we are going to work with so with static method we have can not pass the object of any to the synchronized block
//                  so we have to pass the className.class to the synchronized method

// Even if the main thread is executed the program will not until all the user are executed

// The Thread class in java is implements the Runnable interface by default and override the run
// method such that we can call that run method in our main function with our thread object


// whole picture :===  so basically that is the thing that you can create the thread by the runnable interface
// or extending the Thread class and calling the run method. if by doing it by implement runnable
// interface you have to pass the object of the
// runnable interface to the  Thread class


// LIFE CYCLE OF THREAD  :
//                      In java thread always exist in the following state :
//                      1> new 2>active 3> Blocked / waiting 4> Timed waiting 5> Terminated
//