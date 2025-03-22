/*  Nama File    : PNS.java  
    Deskripsi    : Kelas yang merepresentasikan PNS(Pegawai Negeri Sipil) sebagai turunan Manusia  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 18 Maret 2025 */

import java.util.Calendar;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 4; // A = digit ke 14 nim yaitu 4

    // Konstruktor default
    public PNS(){

    }
    
    // Konstruktor
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // Method
    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar mulaiKerja = Calendar.getInstance();
        mulaiKerja.setTime(gettgl_mulai_kerja());

        return (now.get(Calendar.YEAR) - mulaiKerja.get(Calendar.YEAR)) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("\n==== Informasi PNS ====");
        System.out.println("NIP        : " + nip);
        System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak      : " + hitungPajak());
    }
}