package CaseStudy2;

public class Kendaraan {
    String plat;
    String tipe;
    String merk;
    String IsVvip;

    public Kendaraan(String plat, String tipe, String merk, String IsVvip) {
        this.plat = plat;
        this.tipe = tipe;
        this.merk = merk;
        this.IsVvip = IsVvip;
    }
 
    public void tampilkanInformasi() {
        System.out.println("Informasi Kendaraan: " + IsVvip);
        System.out.println("Plat Nomor: " + plat);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
    }
}