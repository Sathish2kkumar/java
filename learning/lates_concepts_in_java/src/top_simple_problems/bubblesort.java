package top_simple_problems;

public class bubblesort {
    public static void main(String[] args) {
        int b[]={10,11,45,12,13};
        int target=13;
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int data:b){
            System.out.println(data);
        }
        int first=0;
        int last=b.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(target>b[mid]){
                first=mid+1;
            }
            else if(target==b[mid]){
                System.out.println("the target is found in the position"+b[mid]);
                break;
            }
            else{
                last=mid-1;
            }
        }
    }
}
