/*  Nama File    : Anjing.java
    Deskripsi    : Kelas turunan dari Anabul yang merepresentasikan hewan peliharaan jenis anjing. 
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 23 April 2025 
*/

public class Anjing extends Anabul {
    // konstruktor default
    public Anjing() {
        super();
    }

    // konstruktor
    public Anjing(String nama) {
        super(nama);
    }

    // method
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi : Guk-guk!");
    }
}