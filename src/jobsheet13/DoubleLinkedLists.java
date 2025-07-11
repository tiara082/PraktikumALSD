package jobsheet13;

public class DoubleLinkedLists {
    Node head;
    Node tail;    

    DoubleLinkedLists(){
        head = null;
        tail = null;
    }
    boolean isEmpty(){
        return head == null;
    }
    void addFirst(Student data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void addLast(Student data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp!= null) {
            if(temp.data.nim.equalsIgnoreCase(key)){
                if(temp == tail){
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Insertion Failed. Data ("+key+") not found");
        }
    }

    void print(){
        if(!isEmpty()){
            Node temp = head;
            while(temp != null){
                temp.data.print();
                temp = temp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Double linked list is currently empty");
        }
    }
}


