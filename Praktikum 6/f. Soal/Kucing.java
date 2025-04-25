/*  Nama File    : Kucing.java
    Deskripsi    : Kelas turunan dari Anabul yang merepresentasikan hewan peliharaan jenis kucing. 
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 23 April 2025 
*/

public class Kucing extends Anabul {
    // konstruktor default
    public Kucing() {
        super();
    }

    // konstruktor
    public Kucing(String nama) {
        super(nama);
    }

    // method
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi : Meong");
    }
}