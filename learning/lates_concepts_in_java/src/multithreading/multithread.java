package multithreading;

public class multithread extends Thread{
    private int threadposition;

    public multithread(int threadposition) {
        this.threadposition = threadposition;
    }

    @Override
    public void run(){
       for(int i=0;i<=10;i++){
           System.out.println(i+"thread position is "+threadposition);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

    }
}
