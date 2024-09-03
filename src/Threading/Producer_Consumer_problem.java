package Threading;

import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumer_problem {
    private final Queue<Integer> q;
    private final int capacity;

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

    public int remove() {
        synchronized (q) {
            while (q.isEmpty()) {
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
