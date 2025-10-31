package pattern.adapterpattern;

public class laptopcharger implements roundpin{
    private squarepincharger squaredata;

    public laptopcharger(squarepincharger squaredata) {
        this.squaredata = squaredata;
    }

    @Override
    public void roundpincharger() {
        squaredata.charger();
    }
}
