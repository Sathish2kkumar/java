package predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class predicateworkout {
    public static void main(String[] args) {

        Predicate<Integer> value = number -> (number > 0);
        Predicate<Integer> value_1 = number_2 -> (number_2 %2==0);
        System.out.println(value.test(10));
        Predicate<Collection> a = data -> (data.size() > 0);
        ArrayList b = new ArrayList();

        System.out.println(a.test(b));

        int c[] = {10, 20, 60, 43,-81,80};
        Predicate<Integer> d = collect -> (collect % 2 == 0);
        for (int i : c) {
            System.out.println(d.test(i));
        }
//        check(value,c);
//        check(value.negate(),c);
        check(value.and(value_1),c);
//        check(value.or(value_1),c);
    }
    private static void check(Predicate<Integer> value,int c[]){
      for(int i:c){
          boolean result=value.test(i);
          if(result==true){
              System.out.println(i);
          }
//          else{
//              System.out.println("no");
//          }
      }
      //passing the value in order to use the predefined methods like nagate(),or(),and()
        //whereas the negate is used for getting the value which is not true
    }
    }

