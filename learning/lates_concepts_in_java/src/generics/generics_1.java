package generics;

public class generics_1 <T extends generics_2> {
    T gettingoutput;

    public void print(T ouptut) {
        System.out.println(ouptut.b);
    }
}
/*<?> this is called wild card generics by using this we can pass any object to the class though it is similiar Object
that is not recommended we cannot get the values easily*/
//T acts as universal format it's nothing but just a plcae holder
//like this we can use interface not by using implements method by using extends beacause that's the syntax then we can extends multiple interfaces in single class