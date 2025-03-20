/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 25 Februari 2025 */

import java.util.ArrayList;

public class Mahasiswa {
    /************** ATRIBUT ***********/
    private String nim;
    private String namaMhs;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************** KONSTRUKTOR ***********/
    public Mahasiswa() {
        this.nim = " ";
        this.namaMhs = " ";
        this.prodi = " ";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
    }

    public Mahasiswa(String nim, String namaMhs, String prodi) {
        this.nim = nim;
        this.namaMhs = namaMhs;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Selektor(getter)
    public String getNim() {
        return this.nim;
    }

    public String getnamaMhs() {
        return this.namaMhs;
    }

    public String getProdi() {
        return this.prodi;
    }

    // Mutator(Setter)
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /************** METHOD ***********/
    public void addMatKul(MataKuliah matkul) {
        if (this.listMatkul.size() < 50) {
            this.listMatkul.add(matkul);
        } else {
            System.out.println("Maksimal 50 mata kuliah!");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : this.listMatkul) {
            totalSKS += matkul.getsks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return this.listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Nama Mahasiswa: " + this.nim + " - " + this.namaMhs + " (" + this.prodi + ")");
    }

    public void printDetailMhs() {
        System.out.println("Nama Mahasiswa: " + this.namaMhs);
        System.out.println("NIM: " + this.nim);
        System.out.println("Prodi: " + this.prodi);
        System.out.println("Jumlah Mata Kuliah: " + this.listMatkul.size());
        System.out.println("Total SKS diambil: " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : this.listMatkul) {
            matkul.printMatKul();
        }
        if (this.dosenWali != null) {
            this.dosenWali.printDosen();
        }
        if (this.kendaraan != null) {
            this.kendaraan.printKendaraan();
        }
    }
}
