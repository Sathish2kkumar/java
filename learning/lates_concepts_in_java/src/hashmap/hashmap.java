package hashmap;



public class hashmap {
    public static void main(String[] args) {
        System.out.println("testing");
        hashmap object=new hashmap();
        object.add(10,20);
        object.add(20,15);
        System.out.println(object.get(10));
    }
     class node {
        int key;
        int value;
        node next;
         public node(int key, int value) {
             this.key = key;
             this.value = value;
         }
     }
    public static final int size=10;
    node[] buckets=new node[size];
    public static int gettingindex(int key){
        return key%size;
    }
    public void add(int key,int value){
        int index=gettingindex(key);;
        node head=buckets[index];
        while(head!=null){
            if(head.key==key){
                head.value=value;
                return;
            }
            head=head.next;
        }
        node currentnode=new node(key,value);
        currentnode.next=buckets[index];
        buckets[index]=currentnode;
    }
    public int get(int key){
        int index=gettingindex(key);
        node head=buckets[index];
        while (head!=null){
            if(head.key==key){
                return head.value;
            }
            head=head.next;
        }
        return -1;
    }
    public void remove(int key) {
        int index = gettingindex(key);
        node head = buckets[index];
        node prev = null;
        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
            }
            prev = head;
            head = head.next;
        }
    }
}
