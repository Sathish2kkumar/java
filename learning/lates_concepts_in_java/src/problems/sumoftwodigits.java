package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sumoftwodigits {
    public static void main(String[] args) {
      int [] arraydata = {3,3,8,9,6};
//        System.out.println(usinghashmap(arraydata,14));
//        System.out.println(sumofdigitsindeces(arraydata,14));
       for (int a:arraydata){
           System.out.println("As"+a);
       }
        Integer a = 1235446;
        String inttostr = a.toString();
        List<Character> data = new ArrayList<>();
        for(int i=0;i<inttostr.length();i++){
            char b = inttostr.charAt(i);
            data.add(b);
        }
        System.out.println(data);

    }

    public static List<Integer> sumofdigitsindeces(int [] arr,int target){
        List<Integer> indeces = new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    indeces.add(i);
                    indeces.add(j);
                }
            }
        }
         return indeces;
    }
    public static  List<Integer> usinghashmap(int [] arr,int target){
        Map<Integer,Integer> a= new HashMap<>();
        List<Integer> indexes = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Integer Complementindex = a.get(arr[i]);
            if(Complementindex!=null){
                indexes.add(Complementindex);
                indexes.add(i);
            }
            else{
                int targetvalue = target-arr[i];
                a.put(targetvalue,i);
            }

        }
        return indexes;
    }

}
