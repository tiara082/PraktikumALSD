package CaseStudy2;

public class AntrianKendaraan {
    private NodeKendaraan head, tail;


    public void tambahKendaraanBaru(Kendaraan k) {
        NodeKendaraan baru = new NodeKendaraan(k);

        if(k.IsVvip == "VVIP") {
            baru.next = head;
            head = baru;
            if (tail == null){
                tail = baru; 
            } 
            return;
        }else if (head == null || head.data.IsVvip == "Biasa") {
            if (head == null) {
                head = baru;
                tail = baru;
            } else {
                tail.next = baru;
                tail = baru;
            }
        } else {
            NodeKendaraan current = head;
            while (current.next != null && current.next.data.IsVvip == "VVIP") {
                current = current.next;
            }
            baru.next = current.next;
            current.next = baru;
            if (baru.next == null) {
                tail = baru; 
            }
        } 
    }


    public Kendaraan layaniKendaraan() {
        if (head == null) return null;
        Kendaraan k = head.data;
        head = head.next;
        if (head == null) tail = null;
        return k;
    }


    public boolean kosong() {
        return head == null;
    }


    public int hitungAntrian() {
        int count = 0;
        NodeKendaraan current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void tampilkanAntrian() {
        if (kosong()) {
            System.out.println("Antrian kosong.");
            return;
        }

     NodeKendaraan current = head;
        int nomor = 1;
        while (current != null) {
            System.out.println("\nKendaraan ke-" + nomor++);
            if (current.data.IsVvip == "VVIP") {
                current.data.tampilkanInformasi();
                current = current.next;
                continue; 
            }
             System.out.println("\nKendaraan ke-" + nomor++);

            current.data.tampilkanInformasi();
            current = current.next;
        }
        
  
    }
}