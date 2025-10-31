package streaming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findthesumofallcubeelementsgiven {
    public static void main(String[] args) {
        List<Integer> integers = List.of(15,25,35,46,85);
        int integeers = integers.parallelStream().mapToInt(data->data*data*data).sum();
        System.out.println(integeers);
    }
}
