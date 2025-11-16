package zoho_jpmorgan;

public class reverse_array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int first=0;
        int last=a.length-1;
        while(first<last){
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
        for (int b:a) {
            System.out.println(b);
        }
    }
}
