package pattern.observerpattern;

public class subscriber {
    private String name;
    private channel ch = new channel();
    public subscriber(String name) {

        this.name = name;
    }
    public void subscribechannel(channel cha){
        this.ch=cha;
    }
}
