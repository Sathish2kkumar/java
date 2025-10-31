package streaming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class findthesumofsquares {
    public static void main(String[] args) {
        gettingduplicatevaluesinstringusingstream("capgemini");
        List<Integer> onedata = List.of(2,4);
        List<String> strdata = List.of("Apple","Orange","Banana");
//        System.out.println(find_sum_of_squares(onedata));
        System.out.println(gettingthecountofthegivenvalue(strdata));
        Map<String,String> data = new HashMap<>();
        data.put(null,"engineer");
        data.put(null,"doctor");

//        ConcurrentHashMap<String,String> dataone = new ConcurrentHashMap<>();
//        dataone.put(null,"one");
//        dataone.put(null,"two");
//        System.out.println("p"+data);
    }
//    public static int find_sum_of_squares(List<Integer> datas){
//        return datas.stream().map(one->one*one).mapToInt(a->a).sum();
//
//    }
    public static List<String> gettingthecountofthegivenvalue(List<String> data){
        return data.stream().map(v->v.toLowerCase().trim()).filter(U->U.startsWith("a")).toList();
    }
    public static void gettingduplicatevaluesinstringusingstream(String data){
        System.out.println("kkk");
        data.chars().mapToObj(a-> (char) a).collect(Collectors.groupingBy(b->b,Collectors.counting())).entrySet().stream().filter(u->u.getValue()>1).forEach(a-> System.out.println(a.getKey()));
    }
}
