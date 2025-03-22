/*  Nama File    : Pengusaha.java  
    Deskripsi    : Kelas yang merepresentasikan pengusaha sebagai turunan Manusia  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 18 Maret 2025 */

import java.util.Calendar;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 3; // B = digit ke 13 nim yaitu 3

    // Konstruktor default
    public Pengusaha() {

    }
    
    // Konstruktor
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter dan Setter
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Method
    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar mulaiKerja = Calendar.getInstance();
        mulaiKerja.setTime(gettgl_mulai_kerja());

        return (now.get(Calendar.YEAR) - mulaiKerja.get(Calendar.YEAR)) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("\n==== Informasi Pengusaha ====");
        System.out.println("NPWP       : " + npwp);
        System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak      : " + hitungPajak());
    }
}