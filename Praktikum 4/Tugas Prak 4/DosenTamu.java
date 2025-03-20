/*  Nama File    : DosenTamu.java
    Deskripsi    : Kelas untuk menyimpan informasi dosen tamu
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 12 Maret 2025
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate kontrakBerakhir;

    // Konstruktor
    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, 
                     String fakultas, String nidk, String kontrakBerakhir) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.kontrakBerakhir = LocalDate.parse(kontrakBerakhir);
    }

    // Getter
    public String getNidk() {
        return nidk;
    }

    public LocalDate getKontrakBerakhir(){
        return kontrakBerakhir;
    }

    // Setter
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setKontrakBerakhir(LocalDate kontrakBerakhir){
        return kontrakBerakhir;
    }

    // Method
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    // Fungsi untuk print
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Kontrak Berakhir : " + formatTanggal(kontrakBerakhir));
        System.out.println("Tunjangan : Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
