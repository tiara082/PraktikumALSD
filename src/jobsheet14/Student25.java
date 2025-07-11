package jobsheet14;

public class Student25 {
  String nim, name,className;
  double ipk;
  
  public Student25(String nm, String nama, String kls, double ip) {
    nim = nm;
    name = nama;
    className = kls;
    ipk = ip;
  }

  public Student25() {
  }

  void print() {
    System.out.println(nim+ " " + name + " " + className + " " + ipk);
    }
}
