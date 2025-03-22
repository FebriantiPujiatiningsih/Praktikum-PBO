/*  Nama File    : BangunDatar.java
    Deskripsi    : Kelas abstrak untuk bangun datar dengan method perbandingan luas dan keliling 
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 11 Maret 2025 */

public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // Default
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Getter dan Setter
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Metode abstrak
    public abstract double getLuas();
    public abstract double getKeliling();

    // Method lainnya
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // Fungsi untuk print
    public void printInfo() {
        System.out.println("\nJumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printJumlahObjek() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}