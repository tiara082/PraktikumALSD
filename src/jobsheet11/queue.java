package jobsheet11;

public class queue {
    int [] data;
    int front, rear, max, size;

    public queue(int n) {
        max = n;
        data = new int[max];
        front = rear = -1;
        size = 0;
    }
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }
    void peek() {
        if(!isEmpty()) {
            System.out.println("Front data is " + data[front]);
        } else {
            System.out.println("Queue is empty!");
        }
    }
    void print(){
        if (!isEmpty()) {
            int i = front;
            while(i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.print(data[i]+ " ");
            System.out.println("number of elements in queue: " + size);
            
        }else {
            System.out.println("Queue is empty!");
        }
    }

    void clear(){
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("all data has been succesfully removed!");
        } else {
            System.out.println("Queue is empty!");
        }
    }
    void enqueue(int dt){
        if(!isFull()) {
            if(isEmpty()) {
                front = rear = 0;
            } else {
                if(rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            System.out.printf("%d is successfully added at index %d\n", dt, rear);

        } else {
            System.out.println("Queue is full!");
        }
    }

    int dequeue() {
        int dt = 0;
        if(!isEmpty()) {
            dt = data[front];
            size--;
            if(isEmpty()) {
                front = rear = -1;
            } else {
                if(front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        } else {
            System.out.println("Queue is empty!");
        }
        return dt;
    }
}
