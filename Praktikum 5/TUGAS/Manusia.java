/*  Nama File    : Manusia.java
    Deskripsi    : Kelas abstrak untuk manusia dengan atribut dasar
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 18 Maret 2025 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public abstract class Manusia {
    private String nama;
    private Date tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    // Konstruktor default
    public Manusia(){

    }

    // Konstruktor
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = parseTgl(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Method untuk parsing tanggal (Menghindari duplikasi kode)
    private Date parseTgl(String tgl) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(tgl);
        } catch (ParseException e) {
            e.printStackTrace();
            return null; // Jika parsing gagal, kembalikan null
        }
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date gettgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public void settgl_mulai_kerja(String tgl_mulai_kerja) {
        this.tgl_mulai_kerja = parseTgl(tgl_mulai_kerja);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // abstrak hitung masa kerja
    public abstract int hitungMasaKerja();

    // menampilkan informasi
    public void cetakInfo() {
        System.out.println("\n==== Informasi Manusia ====");
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + new SimpleDateFormat("dd-MM-yyyy").format(tgl_mulai_kerja));
        System.out.println("Alamat     : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }
}