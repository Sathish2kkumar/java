package delegates_in_java;

import java.util.Scanner;

public class delegates {
    public static void main(String[] args) {
     supervisor s= new supervisor();
     lead l = new lead();
     manager m = new manager(l);
//     manager m = new manager(s);
     m.gettingname();
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        System.out.println(b);
        for(int i =0;i<b.length();i++){
            if(b.charAt(i)=='a'){
                b.replace(b.charAt(i),' ');
            }
        }
    }
}

class manager implements printing_name {
   printing_name name;

    public manager(printing_name name) {

        this.name = name;
    }
    public void gettingname(){

        name.gettingname();
    }

}

class supervisor implements printing_name{
    @Override
    public void gettingname() {

        System.out.println("hello");
    }
}
class lead implements printing_name{
    @Override
    public void gettingname() {

        System.out.println("lead");
    }
}
// in this the class manager will work like the controller so we can call the function of that interface by using this object
//also delegates in typesafe

