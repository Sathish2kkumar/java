package twopointer;

public class remove_duplicates_using_same_points {
    public static void main(String[] args) {
        String test="banana";
        char[] chartest=test.toCharArray();
        boolean[] ispresent=new boolean[256];
        int slow=0;
        for(int i=0;i<chartest.length;i++){
            if(!ispresent[chartest[i]]){
                ispresent[chartest[i]]=true;
                chartest[slow]=chartest[i];
                slow++;
            }
        }
    }
}
