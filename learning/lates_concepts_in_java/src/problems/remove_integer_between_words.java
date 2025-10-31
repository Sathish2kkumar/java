package problems;

import java.util.Scanner;

public class remove_integer_between_words {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String Inputs = a.nextLine();
        String InputArr[] = Inputs.split(" ");
        String Ouput[] = new String[InputArr.length];
        for(int i=0;i<InputArr.length;i++){
            for(int j=0;j<InputArr[i].length();j++){
                if(InputArr[i].charAt(j)>='0'&&InputArr[i].charAt(j)<='9'){
                   Ouput[Integer.parseInt(InputArr[i].charAt(j)+"")] = InputArr[i].substring(0,j)+InputArr[i].substring(j+1, InputArr[i].length());

                   break;
                }
            }
        }
        String temp="";
        for(int i=0;i< Ouput.length;i++){
            temp=temp+Ouput[i]+" ";

        }
        System.out.println(temp);
    }
}
