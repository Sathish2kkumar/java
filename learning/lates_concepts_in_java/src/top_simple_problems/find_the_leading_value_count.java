package top_simple_problems;
public class find_the_leading_value_count {
    public static void main(String[] args) {
        int b[]={10,11,15,18,16,17,5,25,4,3};
        int index=0;
        int minimumcount=0;
        int tempmincount=0;
        int leader_value=b[0];
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                  minimumcount++;
                }
                else{
                    break;
                }
            }
            if(minimumcount>tempmincount){
              leader_value=b[i];
              index=i;
              tempmincount=minimumcount;
            }
            minimumcount=0;
        }
        System.out.println(tempmincount);
        System.out.println(leader_value);
        System.out.println(index);
    }
}
