/*  Nama File    : Fakultas.java
    Deskripsi    : Kelas untuk merepresentasikan Fakultas dalam universitas
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 25 Maret 2025 
*/

public class Fakultas {
    private String nama;
    private double tarifUkt;
    private double gajiPokok;
    
    // Konstruktor default
    public Fakultas() {
        this.nama = "";
        this.tarifUkt = 0;
        this.gajiPokok = 0;
    }

    // Konstruktor
    public Fakultas(String nama, double tarifUkt, double gajiPokok) {
        this.nama = nama;
        this.tarifUkt = tarifUkt;
        this.gajiPokok = gajiPokok;
    }
    
    // Getter & Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getTarifUkt() {
        return tarifUkt;
    }
    
    public void setTarifUkt(double tarifUkt) {
        this.tarifUkt = tarifUkt;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
        
    // Method
    public void printInfo() {
        System.out.println("Nama Fakultas: " + nama);
        System.out.println("Tarif UKT: " + tarifUkt);
        System.out.println("Gaji Pokok Dosen: " + gajiPokok);
    }
}