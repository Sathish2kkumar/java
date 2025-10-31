package streaming;

import java.util.List;
import java.util.stream.IntStream;

public class sumevenindexedvalues {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        int sumofoddindexes = IntStream.range(0,numbers.size()).filter(data->data%2!=0).map(numbers::get).sum();
        System.out.println(sumofoddindexes);
    }
}
