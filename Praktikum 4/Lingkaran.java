/*  Nama File    : Lingkaran.java
    Deskripsi    : Kelas untuk menghitung luas dan keliling lingkaran
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 11 Maret 2025
*/

public class Lingkaran extends BangunDatar {
    private double jariJari;

    // Default
    public Lingkaran() {
        super(0, "Tidak Diketahui", "Tidak Diketahui");
        this.jariJari = 0.0;
    }

    // Konstruktor
    public Lingkaran(double diameter, String warna, String border) {
        super(4, warna, border); 
        this.jariJari = diameter / 2;
    }

    // Getter
    public double getJariJari() {
        return this.jariJari;
    }

    // Setter
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Fungsi untuk Print
    @Override
    public void printInfo() {
        System.out.println("\n==== Informasi Lingkaran ====");
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Luas: " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}
