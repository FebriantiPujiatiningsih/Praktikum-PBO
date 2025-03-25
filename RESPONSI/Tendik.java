/*  Nama File    : Tendik.java  
    Deskripsi    : Kelas Tendik sebagai subclass dari Karyawan  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 25 Maret 2025  
*/

public class Tendik extends Karyawan {
    private static final double GAJI_POKOK = 4000000; // Gaji pokok untuk tendik

    // Konstruktor
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
    }

    // Implementasi method hitungGaji
    @Override
    public double hitungGaji() {
        return GAJI_POKOK + (masaKerja * 0.01 * GAJI_POKOK);
    }

    @Override
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}