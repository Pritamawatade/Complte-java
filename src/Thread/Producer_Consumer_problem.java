package Thread;

import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumer_problem {
    private Queue<Integer> q;
    private int capacity;

    public Producer_Consumer_problem(int cap) {
        q = new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int item) {
        synchronized (q) {

            while (q.size() == capacity) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            q.add(item);
            System.out.println("item added  = "+ item);
            q.notifyAll();
            return true;
        }
    }

    public int reomve() {
        synchronized (q) {
            while (q.size() == 0) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            int element = q.poll();
            System.out.println("item removed  = "+ element);

            q.notifyAll();
            return element;
        }
    }
}
