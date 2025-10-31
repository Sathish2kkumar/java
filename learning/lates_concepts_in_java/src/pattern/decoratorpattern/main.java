package pattern.decoratorpattern;

public class main {
    public static void main(String[] args) {
        burger dessert= new recipie();
        dessert= new concreteclass(dessert);
        System.out.println(dessert.bun());
    }
}
