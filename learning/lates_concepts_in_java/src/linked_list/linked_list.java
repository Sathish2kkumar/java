package linked_list;

import java.util.List;

public class linked_list {
    Node FirstNode;

    public void add(String data) {
        Node currentdata = new Node(data);
        if (FirstNode == null) {
            FirstNode = currentdata;
            return;
        }
        Node current = FirstNode;
        while (current.next != null) {
            current = current.next;
        }
        current.next = currentdata;
    }

    public void display() {
        Node current = FirstNode;
        if (FirstNode == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public void delete(String data) {

        if (FirstNode.data.equals(data)) {
            FirstNode = FirstNode.next;
            return;
        }
        Node current = FirstNode;
        while (current.next != null && !current.next.equals(data)) {
            current = current.next;
            System.out.println();
        }

        if (current.next == null) {
            System.out.println("the given value is not available in list");
        } else {
            current.next = current.next.next;
        }
    }
    public void reverse() {
        Node prev = null;
        Node current = FirstNode;
        Node next = null;
        while (current != null) {
            // Step 1: Save next node
            next = current.next;

            // Step 2: Reverse the link
            current.next = prev;
            // Step 3: Move prev and current forward
            prev = current;
            current = next;
        }
        FirstNode = prev;
    }
    public void update(String olddata,String newdata){
        Node current = FirstNode;
        while(current.data!=null){
            if(current.data.equals(olddata)){
                current.data=newdata;
            }
            current=current.next;
        }
    }
}
