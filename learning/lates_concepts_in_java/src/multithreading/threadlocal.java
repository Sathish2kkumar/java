package multithreading;

public class threadlocal {
    static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {

        Runnable task = () -> {
            // Each thread starts with 0
            int value = threadLocalValue.get(); // get its own value
            threadLocalValue.set(value + 1);    // change its own value
            System.out.println(Thread.currentThread().getName() + ": " + threadLocalValue.get());
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();
    }
}
