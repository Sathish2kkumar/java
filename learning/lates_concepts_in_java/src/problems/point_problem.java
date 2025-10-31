package problems;

public class point_problem {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;
        for(double i = b;i<12; Math.round(i+=0.1)){
            for(double j=a;j<12;Math.round(j+=0.1)){
                System.out.println(i+"-"+j);
            }
        }
    }

}
