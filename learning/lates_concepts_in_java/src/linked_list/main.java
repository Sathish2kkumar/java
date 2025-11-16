package linked_list;

public class main {
    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.add("sathish");
        list.add("kumar");
        list.add("ramesh");
//        list.display();
//        list.delete("sathish");
//        list.display();
        list.reverse();
        list.display();
    }
}
