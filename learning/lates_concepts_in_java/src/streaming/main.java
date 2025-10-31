package streaming;

public class main {
    public static void main(String[] args) {
        bus a = ()->{
            System.out.println("on back tyre");
        };
        a.puncture();




    }
    class tyre implements bus{
        @Override
        public void puncture() {
            System.out.println("onedata");
        }
    }
}
