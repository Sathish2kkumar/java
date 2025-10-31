package problems;

import java.util.Scanner;

public class removal_of_vowels {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        removal_of_vowels t = new removal_of_vowels();
        System.out.println(t.gettinginputs(b));

    }
    public String gettinginputs(String input){
        StringBuilder formattinginput = new StringBuilder();
        for(char d : input.toCharArray()){
            if(!removevowels(d)) {
                formattinginput.append(d);
            }
        }
        return formattinginput.toString();
    }
    public boolean removevowels(char in){
        char convertinglowercase = Character.toLowerCase(in);
        return convertinglowercase=='a'||convertinglowercase=='e'||convertinglowercase=='i'||convertinglowercase=='o'||convertinglowercase=='u';
    }

}
