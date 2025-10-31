package pattern.observerpattern;

public class main {
    public static void main(String[] args) {
        channel techprogram = new channel();
        subscriber a1 = new subscriber("sathish");
        subscriber a2 = new subscriber("suresh");
        subscriber q3 = new subscriber("rajesh");
        techprogram.addsubscriber(a1);
        techprogram.addsubscriber(a2);
        techprogram.addsubscriber(q3);
        techprogram.update("pattern video");

    }
}
