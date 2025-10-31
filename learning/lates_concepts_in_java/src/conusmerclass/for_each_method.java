package conusmerclass;

import java.util.*;
import java.util.stream.Stream;

public class for_each_method {
    public static void main(String[] args) {
        List a = Arrays.asList(10,20,30);
        a.forEach(b-> System.out.println(b));
        a.stream().filter((data)->data.equals(30)).forEach(System.out::println);
        Collection<Integer> company = new TreeSet<>();
        company.add(10);
        company.add(10);
        company.add(30);
        company.add(40);
        System.out.println(company);
        Set<Integer> set_1 = new HashSet<>();
        set_1.add(10);
        set_1.add(20);
        set_1.add(30);
        System.out.println(set_1);
        Map<String,Integer> datas = new HashMap<>();
        datas.put("tickets_sold",1000);
        datas.put("tickets_onhold",500);

        for(String key_value :datas.keySet()){
            System.out.println(key_value);
        }
        int values = datas.get("tickets_sold");
        System.out.println(values);
        System.out.println(datas);
        //set cannot allows duplicate values
        //hashset is common for every collections classes it aranges the values based on it own occurence which we cannot predict the arrangements but the arrangements is done by the compiler which is not equal to what we are given
        //treeset arrange the elements in ascending order or universal order that we use for sorting

    }
}
