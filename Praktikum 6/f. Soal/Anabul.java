/*  Nama File    : Anabul.java
    Deskripsi    : Kelas abstrak untuk merepresentasikan Anabul. Kelas ini berisi atribut nama dan method dasar gerak serta bersuara, yang nantinya  
                   akan dioverride oleh kelas turunan seperti Kucing, Anjing, dan Burung.  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 23 April 2025 
*/

public abstract class Anabul {
    // atribut
    protected String nama;

    // konstruktor default
    public Anabul() {
        this.nama = " ";
    }

    // konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    } 

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter
    public String getNama() {
        return nama;
    }

    // method
    public void gerak(){

    }

    public void bersuara(){

    }
}