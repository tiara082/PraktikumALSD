package jobsheet12;

public class SingleLinkedList {
    Node head;
    Node tail;
 
    boolean isEmpty(){
        return (head==null);
        }
        void print(){
            if(!isEmpty()){
            Node tmp = head;
            System.out.println("LinkedList Data:");
                while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
                }
                }else{
                System.out.println("LinkedList is empty!!");
                }
                }

                void addFirst(student std){
                    Node newNode = new Node(std, null);
                    if(isEmpty()){
                    head = newNode;
                    tail = newNode;
                    }else{
                    newNode.next = head;
                    head = newNode;
                    }
                    }

                    void addLast(student std){
                        Node newNode = new Node(std, null);
                        if(isEmpty()){
                        head = newNode;
                        tail = newNode;
                        }else{
                        tail.next = newNode;
                        tail = newNode;
                        }
                        }
                        

}
