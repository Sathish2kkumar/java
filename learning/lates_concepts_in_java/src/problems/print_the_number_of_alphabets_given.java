package problems;

public class print_the_number_of_alphabets_given {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("b1a4");
        StringBuilder output = new StringBuilder();
         for(int i=0;i<input.length();i++){
             if(Character.isDigit(input.charAt(i))){
                 int count = Character.getNumericValue(input.charAt(i));
                 for(int j=1;j<=count;j++){
                     System.out.println(input.charAt(i));
                     output.append(input.charAt(i-1));
                 }
             }
         }
        System.out.println("output of the given input  "+output);
    }
}
