package hashmap;



public class hashmap {
     class node {
        int key;
        int value;
        node next;
        node(int key,int value){
            key=this.key;
            value=this.value;
        }

    }
    public static final int size=10;
    node[] buckets=new node[size];
    public static int gettingindex(int key){
        return key%size;
    }
    public void add(int key,int value){
        int index=gettingindex(key);
        node head=buckets[index];
        while(head!=null){
            if(head.key==key){
                head.value=value;
                return;
            }
            node currentnode=new node(key,value);
            currentnode.next=buckets[index];
            buckets[index]=currentnode;
        }
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
    public void remove(int key){
        int index=gettingindex(key);
        node head=buckets[index];
        node prev=null;
        if(head.key==key){
            if(prev==null){
                buckets[index]=head.next;
            }
            else{
                prev.next=head.next;
            }
        }
        prev=head;
        head=head.next;
    }
}
