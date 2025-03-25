/*  Nama File    : Karyawan.java  
    Deskripsi    : Kelas abstrak untuk merepresentasikan Karyawan dalam universitas  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 25 Maret 2025  
*/

public abstract class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;
    protected static int jumlahKaryawan = 0; 

    // Konstruktor
    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
        jumlahKaryawan++; 
    }

    // Getter & Setter
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public static int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    // Method abstrak untuk menghitung gaji (diimplementasikan di subclass)
    public abstract double hitungGaji();

    // Override method tampilkanInfo
    @Override
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Gaji: Rp" + hitungGaji());
    }

    // Method untuk mencetak jumlah karyawan
    public static void printJumlahKaryawan() {
        System.out.println("Total Karyawan: " + jumlahKaryawan);
    }
}