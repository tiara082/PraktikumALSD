package jobsheet14;

public class BinaryTreeArray25 {
    Student25[] data;
    int idxLast;

    public BinaryTreeArray25() {
        data = new Student25[10];
        idxLast = -1;
    }

    void populateData(Student25[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void add(Student25 student) {
        if (idxLast + 1 < data.length) {
            idxLast++;
            data[idxLast] = student;
        } else {
            System.out.println("Tree is full!");
        }
    }
}
