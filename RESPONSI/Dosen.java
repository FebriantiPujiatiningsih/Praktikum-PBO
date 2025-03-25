/*  Nama File    : Dosen.java  
    Deskripsi    : Kelas Dosen sebagai subclass dari Karyawan  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 25 Maret 2025  
*/

public class Dosen extends Karyawan {
    private Fakultas fakultas;

    // Konstruktor
    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
    }

    // Getter & Setter
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    // Implementasi method hitungGaji
    @Override
    public double hitungGaji() {
        double gajiPokok = fakultas.getGajiPokok();
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    @Override
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIP: " + NIP);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}