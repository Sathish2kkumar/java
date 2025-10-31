package pattern.decoratorpattern;

public abstract class extras implements burger {
    protected burger meatburger;

    public extras(burger meatburger) {
        this.meatburger = meatburger;
    }
    public String bun(){
        return meatburger.bun();
    }
    public String meat(){
        return meatburger.meat();
    }
}
