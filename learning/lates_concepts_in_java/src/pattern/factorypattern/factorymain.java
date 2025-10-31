package pattern.factorypattern;

public class factorymain {
    public static void main(String[] args) {
        type_operatingsystem typingdata = new type_operatingsystem();
        os lat=typingdata.typeos("secured");
        lat.operatingsystem();
    }
}
