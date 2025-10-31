package problems;

public class reverse_the_integer {
    public static void main(String[] args) {
        int input = -123;
        boolean isnegative=false;
        int output = 0;
        if(input<0){
            input=Math.abs(input);
            isnegative=true;
        }
//        System.out.println(input);
        while(input!=0){
            int digit = input%10;
//            System.out.println(digit);
            input=input/10;
            output=output*10+digit;
            System.out.println(output);
        }
        if(isnegative){
            output=-output;
        }
        System.out.println(output);


    }
}
