package doublecolonoperator;

public class doublecolonoperator {
    public doublecolonoperator(String d){
        System.out.println(d);
    }
    public static void main(String[] args) {
//        sensex a = (b)->{
//            System.out.println(b);
//        };
        //doublecolon operator it is used for make our code legible manner and looks more efficient the above code can be written like this given below
        sensex a =System.out::println;
        //and also we can use this colon operator which performs similiar funciton like i given below
        a.d("Sathish");
//        doublecolonoperator colon = new doublecolonoperator("kumar");
//            sensex b = colon::processing2;//non-static methos
        sensex c = doublecolonoperator::processing;//static method
        sensex d =new doublecolonoperator("michael")::processing2;//without creating the object to the class
        sensex e =doublecolonoperator::new;
        e.d("muthu");
        c.d("raman");
    }
    public static void processing(String name){
        System.out.println(name);
    }
    public  void processing2(String name){
        System.out.println(name);
    }
}
//this can called by 4 methods
//*one is by using static methods in this we dont want create the object for the class juct straigh away we can call the
//function like this class_name::methodname
//*one is by using the constructor when use the constructor we need use new keyword like this
//class_object_name::new;
//*one is normal methos whereas the function the normal function is declared its operation is same as the inerface operataion
//we need call like this class_object_name::method_name
//*the last one we dont want to create the onject for the class straght away get the object of the interface and call the
//class name using new keyword like interface object=new classname(parameters)