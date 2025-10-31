package pattern.factorypattern;

public class type_operatingsystem {
    public os typeos(String data){
        if(data.equals("latest")){
            return new android();
        } else if (data.equals("secured")) {
            return new apple();
        }
        else{
            return new windows();
        }
    }
}
