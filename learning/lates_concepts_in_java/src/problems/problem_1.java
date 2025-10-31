package problems;

import streaming.student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class problem_1 {
    public static void main(String[] args) {
        List<Integer> data1 = List.of(10,20,30,40,50,70,80);
        List<Integer> data2 = List.of(25,24,23,10,20,40);
        int arr[] = {10,20,30,40,50};
        System.out.println(maximumsumodsubarrays(arr,3));
        List words = List.of("apple","banana","grapes");
        List<Integer> data3 = data1.stream().filter(data2::contains).toList();
        List<Integer> data4 = Stream.concat(data1.stream(),data2.stream()).toList();
        System.out.println(data3);
        System.out.println(data4);
        List<student> data5 = List.of(new student("sathish","engineer"),new student("suresh","engineer"),new student("rajesh","doctor"));
        data5.stream().collect(Collectors.groupingBy(student::getDepartment)).entrySet().forEach(System.out::println);
        System.out.println(words.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())));
        data2= data2.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(data2);
    }
    public static int maximumsumodsubarrays(int [] arr,int target){
        int intitial_val = 0;

        for(int i=0;i<3;i++){
            intitial_val+=arr[i];
        }
        int windowsum = intitial_val;
        for(int j=target;j<arr.length;j++){
            intitial_val+= arr[j]-arr[j-target];
            windowsum=Math.min(windowsum,intitial_val);
        }
        return windowsum;
    }
}
