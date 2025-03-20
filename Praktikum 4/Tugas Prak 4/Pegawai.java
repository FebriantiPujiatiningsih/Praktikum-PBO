/*  Nama File    : Pegawai.java
    Deskripsi    : Kelas dasar untuk pegawai
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 12 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir, formatter);
        this.tmt = LocalDate.parse(tmt, formatter);
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = LocalDate.parse(tanggalLahir);
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(String tmt) {
        this.tmt = LocalDate.parse(tmt);
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method
    public String hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period masaKerja = Period.between(tmt, sekarang);

        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

        return tanggal.format(formatter);
    }

    // Fungsi untuk print
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
    }
}
