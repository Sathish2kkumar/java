package top_simple_problems;

public class reverse_integer_negative_values {
    public static void main(String[] args) {
        int input=-352;
        boolean isnegative=false;
        if(input<0){
            System.out.println("sdsd");
            isnegative=true;
        }
        System.out.println(isnegative);
        int convert_whole=Math.abs(input);
        int output=0;
        while(convert_whole!=0){
            int digit=convert_whole/10;
            output=output*10+digit;
            convert_whole=convert_whole%10;
        }
        if(isnegative==true){
            convert_whole=-convert_whole;
        }

    }
}
