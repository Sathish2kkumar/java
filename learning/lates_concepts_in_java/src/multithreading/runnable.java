package multithreading;

import java.lang.invoke.VolatileCallSite;

public class runnable {
    public  static void main(String[] args) {
        Runnable data = ()->{
            for(int i=0;i<5;i++){
                System.out.println(i);
            }
        };
        new Thread(data, "worker1").start();
        new Thread(data,"worker2").start();

    }
}
