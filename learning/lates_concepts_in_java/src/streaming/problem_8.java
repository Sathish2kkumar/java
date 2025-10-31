package streaming;

import java.util.Scanner;

public class problem_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = 0;

            for(char a:str.toCharArray()) {
                length++;
            }
        System.out.println(reverseString(str));

        System.out.println("Length of the string: " + length);
        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder b = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            b.append(str.charAt(i));
        }
        return b.toString();
    }

}
