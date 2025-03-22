/*  Nama File    : Petani.java  
    Deskripsi    : Kelas yang merepresentasikan petani sebagai turunan Manusia  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 18 Maret 2025 */

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 0; // C = digit ke 12 nim yaitu 0

    // Konstrukor default
    public Petani() {

    }
    
    // Konstruktor
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter dan Setter
    public String getasal_kota() {
        return asal_kota;
    }

    public void setasal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // Method
    @Override
    public int hitungMasaKerja() {
        Date sekarang = new Date();
        long selisihMiliDetik = sekarang.getTime() - super.gettgl_mulai_kerja().getTime();
        int tahun = (int) TimeUnit.DAYS.convert(selisihMiliDetik, TimeUnit.MILLISECONDS) / 365;
        return tahun + C;
    }

    @Override
    public double hitungPajak() {
        return 0.0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("\n==== Informasi Petani ====");
        System.out.println("Asal Kota  : " + asal_kota);
        System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak      : " + hitungPajak());
    }
}
