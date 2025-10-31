package pattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class channel {
    private String title;
    List<subscriber> subs = new ArrayList<>();
    public void addsubscriber(subscriber sub){
        subs.add(sub);
    }
    public void removesubscriber(subscriber sub){
        subs.remove(sub);
    }
    public void notifysubscriber(){
        for(subscriber s :subs){
            System.out.println("subscribed successfully");
        }
    }
    public void update(String video){
        System.out.println(video);
        notifysubscriber();
    }
}
