package problems;

import java.util.ArrayList;
import java.util.List;

public class convertintegertoarray {


    public static void main(String[] args) {
        Integer value=1012;
        List<Character> userdata=new ArrayList<>();
        String values = value.toString();
        for(int i=0;i<values.length();i++){
            char data = values.charAt(i);
            System.out.println("onedee"+data);
            userdata.add(data);
        }
        System.out.println("onedatatata"+userdata);
    }
}
