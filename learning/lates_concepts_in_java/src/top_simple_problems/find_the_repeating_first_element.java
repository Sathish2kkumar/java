package top_simple_problems;

public class find_the_repeating_first_element {
    public static void main(String[] args) {
        int b[] = {1,4,5,8,9,10,12,12,13,13,14};
        int temporaryvariable=0;
        for(int i=0;i<b.length;i++){
            if(temporaryvariable==b[i]) {
                break;
            }
            temporaryvariable=b[i];
        }
        System.out.println(temporaryvariable);
    }

}
