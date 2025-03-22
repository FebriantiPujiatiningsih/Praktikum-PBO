/*  Nama File    : PNS.java  
    Deskripsi    : Kelas yang merepresentasikan PNS(Pegawai Negeri Sipil) sebagai turunan Manusia  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 18 Maret 2025 */

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 4; // A = digit ke 14 nim yaitu 4

    // Konstruktor default
    public PNS(){
        super();
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
        Date sekarang = new Date();
        long selisihMiliDetik = sekarang.getTime() - super.gettgl_mulai_kerja().getTime();
        int tahun = (int) TimeUnit.DAYS.convert(selisihMiliDetik, TimeUnit.MILLISECONDS) / 365;
        return tahun + A;
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
