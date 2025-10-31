package conusmerclass;

import java.util.function.Function;

public class Function_1 {
    public static void main(String[] args) {
        Function<String,Integer>f =(name)->name.length();
        System.out.println(f.apply("sathish"));
    }
}
