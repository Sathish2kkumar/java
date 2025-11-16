package zoho_jpmorgan;

public class movingzerotoend {
    public static void main(String[] args) {
        int a[]={10,0,2,0,12,32};
        int First=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[First];
                a[First]=a[i];
                a[i]=temp;
                First++;
            }
        }
        for(int b:a){
            System.out.println(b);
        }
    }
}
