package pattern.adapterpattern;

public class phone {
    private final roundpin rpin;
    public phone(roundpin rpin) {
        this.rpin = rpin;
    }
    public void chrging(){
        rpin.roundpincharger();
    }
}
