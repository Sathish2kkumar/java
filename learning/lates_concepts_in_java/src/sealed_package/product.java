package sealed_package;

public class product {
    private String modelname;
    private String modelnumber;
    public product(String modelname,String modelnumber){
        this.modelname=modelname;
        this.modelnumber=modelnumber;
    }
    public String getModelname(String modelname){
        return this.modelname=modelname;
    }
}
