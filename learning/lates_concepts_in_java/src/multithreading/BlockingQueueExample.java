package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        // Create a blocking queue with capacity 5
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    queue.put(value);  // blocks if queue is full
                    System.out.println("Produced: " + value);
                    value++;
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int item = queue.take();  // blocks if queue is empty
                    System.out.println("Consumed: " + item);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });

        producer.start();
        consumer.start();
    }
}

