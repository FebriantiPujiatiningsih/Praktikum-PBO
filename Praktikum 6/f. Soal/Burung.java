/*  Nama File    : Burung.java
    Deskripsi    : Kelas turunan dari Anabul yang merepresentasikan hewan peliharaan jenis burung. 
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 23 April 2025 
*/

public class Burung extends Anabul {
    // konstruktor default
    public Burung() {
        super();
    }

    // konstruktor
    public Burung(String nama) {
        super(nama);
    }

    // method
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi : Cuit");
    }
}