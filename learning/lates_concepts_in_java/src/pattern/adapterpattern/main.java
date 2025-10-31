package pattern.adapterpattern;

public class main {
    public static void main(String[] args) {
        squarepincharger s = new squarepincharger();
        roundpin v= new laptopcharger(s);
        phone i = new phone(v);
    }


}
