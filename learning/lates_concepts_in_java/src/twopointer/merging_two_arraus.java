package twopointer;

public class merging_two_arraus {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[]={1,3,5};
        int b[]={2,4,6};

        int i=0;
        int j=0;
        int k=0;
        int result[] = new int[a.length+b.length];

        while(i<=a.length-1&&j<=b.length-1){
            if(a[i]<=b[j]){
                result[k++]=a[i++];
            }else{
                result[k++]=b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }


        while (j < b.length) {
            result[k++] = b[j++];
        }

        for(int value:result){
            System.out.println(value);
        }

    }
}
