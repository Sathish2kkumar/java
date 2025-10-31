package streaming;

import com.sun.jdi.CharValue;

import java.util.List;

public class problem_6 {
    public static void main(String[] args) {
        List<String> data = List.of("one","two","three","four");
        String a = "o";
        int h=filteringthestringsthatstartswithS(data,a);
        System.out.println(h);
    }
    //there is an difference between count and sum in this array the count will get the count of the string wither the sum will sum the cahrs in the array string
    public static int filteringthestringsthatstartswithS(List<String> stringdata,String b){
        return stringdata.stream().filter(data->data.startsWith(b)).mapToInt(String::length).sum();
    }
}
