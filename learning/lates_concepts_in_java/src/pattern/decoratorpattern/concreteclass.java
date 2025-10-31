package pattern.decoratorpattern;

public class concreteclass extends extras{
    public concreteclass(burger one) {
        super(one);
    }
    public String bun(){
        return meatburger.bun()+"ooo";
    }
    public String meat(){
        return meatburger.meat()+"pepper";
    }

}
