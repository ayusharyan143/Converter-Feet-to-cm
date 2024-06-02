package threads ; 

import java.util.LinkedList;
class Q {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public Q(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notifyAll();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == 0) {
                wait();
            }
            int item = buffer.removeFirst();
            System.out.println("Consumed: " + item);
            notifyAll();
        }
    }
}

class Producer extends Thread {
    private Q buffer;

    public Producer(Q buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private Q buffer;

    public Consumer(Q buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                buffer.consume();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class producerConsumer {

    public static void main(String[] args) {
        
        Q buffer = new Q(3);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
    
}
