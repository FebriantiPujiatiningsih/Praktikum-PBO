/*  Nama File    : Dosen.java
    Deskripsi    : Kelas untuk menyimpan informasi dosen
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 12 Maret 2025
*/

public class Dosen extends Pegawai {
    private String fakultas;

    // Konstruktor
    public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // Getter
    public String getFakultas() {
        return fakultas;
    }

    // Setter
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Fungsi untuk print
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + fakultas);
    }
}