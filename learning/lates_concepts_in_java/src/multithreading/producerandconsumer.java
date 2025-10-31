package multithreading;

import java.util.LinkedList;
import java.util.List;

public class producerandconsumer {
    public static void main(String[] args) {
        List<Integer> buffer = new LinkedList<>();
        final int MAX_CAPACITY = 5;
        Thread producer = new Thread(()->{
            int value=0;
            synchronized (buffer){
                while (buffer.size()==MAX_CAPACITY){
                   try {
                       buffer.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                }
                value++;
                buffer.add(value);

            }
        });

        Thread consumer = new Thread(
                ()->{
                    synchronized (buffer){
                        while (buffer.isEmpty()){
                            try {
                                buffer.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        int value=buffer.remove(0);
                        buffer.notify();
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        producer.start();
        consumer.start();
    }
}
