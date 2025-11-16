package zoho_jpmorgan;

public class reverse_the_sentence_without_using_the_string {
    public static void main(String[] args) {
        String data = "I am a fox";
        StringBuilder temp=new StringBuilder();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<data.length();i++){
            char ch=data.charAt(i);
            if(ch!=' '){
                temp.append(ch);
            }
            else {
                result.append(temp.reverse());
                result.append(" ");
                temp.setLength(0);
            }
        }
        result.append(temp.reverse());
        System.out.println(result.toString());
    }

}
