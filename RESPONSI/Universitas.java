/*  Nama File    : Universitas.java
    Deskripsi    : Kelas untuk merepresentasikan Universitas
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 25 Maret 2025 
*/

import java.util.ArrayList;

public class Universitas {
    private String nama;
    private ArrayList<Fakultas> daftarFakultas;
    private ArrayList<CivitasAkademika> daftarCivitas;
    
    // Konstruktor
    public Universitas(String nama) {
        this.nama = nama;
        this.daftarFakultas = new ArrayList<>();
        this.daftarCivitas = new ArrayList<>();
    }
    
    // Method
    public void tambahFakultas(Fakultas fakultas) {
        this.daftarFakultas.add(fakultas);
    }
        
    public void tambahCivitas(CivitasAkademika civitas) {
        this.daftarCivitas.add(civitas);
    }
        
    public void printInfo() {
        System.out.println("Nama Universitas: " + this.nama);
        System.out.println("Daftar Fakultas:");
        for (Fakultas f : daftarFakultas) {
            System.out.println("- " + f.getNama());
        }
        System.out.println("Daftar Civitas Akademika:");
        for (CivitasAkademika c : daftarCivitas) {
            c.printInfo();
        }
    }
}