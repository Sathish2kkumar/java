package top_simple_problems;

public class binary_search {
    public static void main(String[] args) {
        int data[]={10,20,30,40,50};
        int findvalue=20;
        int firstvalue=0;
        int lastvalue=data.length-1;
         while(firstvalue<=lastvalue){
             int midvalue=(firstvalue+lastvalue)/2;
             System.out.println(midvalue);
             if(findvalue==data[midvalue]){
                 System.out.println("the values found at position"+midvalue);
                 break;
             } else if (findvalue>data[midvalue]) {
                 firstvalue=midvalue+1;
             }
             else{
                 lastvalue=midvalue-1;
             }
         }
        }
    }
