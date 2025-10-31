package top_simple_problems;

public class findingsecondhighest {
    public static void main(String[] args) {
        int data[] = {10,11,15,50};
        int firstgreater = Integer.MIN_VALUE;
        int secondgreater = Integer.MIN_VALUE;
        for(int a :data){
            if(a>firstgreater){
                secondgreater=firstgreater;
                firstgreater=a;
            } else if (a<firstgreater&&a>secondgreater) {
                secondgreater=a;
            }

        }
        System.out.println("second greater"+secondgreater);

    }
}
