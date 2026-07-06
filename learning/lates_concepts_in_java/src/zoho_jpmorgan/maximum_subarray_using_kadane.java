package zoho_jpmorgan;

public class maximum_subarray_using_kadane {
    public static void main(String[] args) {
        int data[] = {-2,3,4,5,-8};
        int currentsum=data[0];
        int maxvalue=data[0];
        for(int i=1;i<data.length;i++){
            currentsum=Math.max(data[i],currentsum+data[i]);
            maxvalue=Math.max(maxvalue,currentsum);
        }
        System.out.println(maxvalue);
    }
}
