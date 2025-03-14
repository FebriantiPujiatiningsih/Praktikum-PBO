/*  Nama File    : Persegi.java
    Deskripsi    : Kelas untuk menghitung luas dan keliling persegi
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 11 Maret 2025
*/

public class Persegi extends BangunDatar {
    private double sisi;
 
    // Default
    public Persegi() {
      super();
      this.sisi = 0.0;
    }

    // Konstruktor
    public Persegi(double sisi, String warna, String border) {
      super(4, warna, border);
      this.sisi = sisi;
      this.setWarna(warna);
      this.setBorder(border);
    }
 
    // Getter dan Setter
    public double getSisi() {
      return this.sisi;
    }
 
    public void setSisi(double sisi) {
      this.sisi = sisi;
    }
 
    public double getLuas() {
      return this.sisi * this.sisi;
    }
 
    public double getKeliling() {
      return this.sisi * 4.0;
    }
 
    public double getDiagonal() {
      return this.sisi * Math.sqrt(2.0);
    }

    // Fungsi untuk print
    @Override
    public void printInfo() {
      System.out.println("\n===== Informasi Persegi ====");
      System.out.println("Sisi: " + getSisi());
      System.out.println("Warna: " + getWarna());
      System.out.println("Border: " + getBorder());
      System.out.println("Luas: " + getLuas());
      System.out.println("Keliling: " + getKeliling());
      System.out.println("Diagonal: " + getDiagonal());
    }
}