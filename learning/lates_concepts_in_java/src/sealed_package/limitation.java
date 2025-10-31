package sealed_package;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class limitation  {
    public static void work(){
        System.out.println("one");
    }

    public static void main(String[] args) {
        limitation b = new limitation();
        System.out.println("sdsds"+b);
        List<Integer> data1 = List.of(10,20,30,40,50);
        List<Integer> data2 = List.of(20,30,40,50,60);
        List<Integer> data3 = Stream.concat(data2.stream(),data1.stream()).toList();
        System.out.println(data3);
        System.out.println("onedata"+data3);
//        List<product> pr = List.of(new product("onething","one"),new product("twothins","two"),new product("threething","two"));
//        pr.stream().collect(product::)
    }
}
