package practise;

public class reverse_the_number {

    public static void main(String[] args) {
        int number=105;
        int reversethenumber=0;
        while(number!=0){
            int digit =number%10;
            number=number/10;
            reversethenumber=reversethenumber*10+digit;
        }
        System.out.println(reversethenumber);

        int data[]={1,2,3,4,5,6,7,9,10};
        int n=data[data.length-1];
        int values = n*(n+1)/2;
        int givenvalue=0;
        for(int i=0;i< data.length;i++){
            givenvalue+=data[i];
        }
        int missingvalue=values-givenvalue;
        System.out.println("missing value0"+missingvalue);
    }
}
