package streaming;

import java.util.List;
import java.util.Optional;

public class problem_3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,45,85,3,1);
        System.out.println(sumofallevennumbers(numbers));
        System.out.println(sumofalloddnumbers(numbers));
    }
    public static int sumofallevennumbers(List<Integer> values){
        return values.stream().filter(data->data%2==0).mapToInt(Integer::intValue).sum();

    }
    public static int sumofalloddnumbers(List<Integer> values){
        return values.stream().filter(data->data%2!=0).mapToInt(Integer::intValue).sum();

    }
}
