/*  Nama File    : Pegawai.java
    Deskripsi    : Kelas untuk menentukan nama dan gaji dari pegawai
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Pegawai {
    // atribut
    protected String nama;
    protected int gajiPokok = 5000000;

    // konstruktor default
    public Pegawai() {
        this.nama = " ";
        this.gajiPokok = 0;
    }

    // konstruktor
    public Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    // method
    public void tampilData () {
        System.out.println("Nama : " + nama+", Gaji Pokok : " + gajiPokok);
    }
}