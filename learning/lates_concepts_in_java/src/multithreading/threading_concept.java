package multithreading;

import java.util.HashMap;
import java.util.Map;

public class threading_concept {
    public static void main(String[] args) {

        for(int i=0;i<2;i++) {
            multithread a = new multithread(i);
            a.start();
            a.isAlive();
        }
        /*now this is thread is running simultaneously though there is an error in some of the lines*/
    }
}
