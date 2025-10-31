package zoho_problems;

public class twisted_primenumber {
    public static void main(String[] args) {
        int number=97;
        System.out.println(is_primenumber(number));
    }
    public static boolean is_primenumber(int input){
        boolean is_prime=true;
        int reversedinput=0;
        int input2=input;
        while (input2>0){
            int digit=input2%10;
            reversedinput=reversedinput*10+digit;
            input2=input2/10;
        }
      for(int i=2;i<=Math.sqrt(input);i++){
          if(input!=i){
              is_prime = input%i==0||reversedinput%i==0?false:true;
          }
      }
      return is_prime;
    }
}
