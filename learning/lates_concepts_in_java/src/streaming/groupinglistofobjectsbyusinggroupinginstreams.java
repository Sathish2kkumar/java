package streaming;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupinglistofobjectsbyusinggroupinginstreams {
    public static void main(String[] args) {
        List<student> stdlist = List.of(new student("sat","doc"),new student("ram","engineer"),new student("suresh","engineer"));
        Map<String,List<student>> studentdata= stdlist.stream().collect(Collectors.groupingByConcurrent(student::getDepartment));
        System.out.println(studentdata);
    }

}
