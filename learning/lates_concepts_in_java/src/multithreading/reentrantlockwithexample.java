package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class reentrantlockwithexample {
    private static ReentrantLock l = new ReentrantLock();
    public static void main(String[] args) {
     Thread t1 = new Thread(() ->{
        for(int i=0;i<1000;i++){
           try{
               l.lock();
           }
           finally {
               l.unlock();
           }
        }
     });
     t1.start();
    }

}
