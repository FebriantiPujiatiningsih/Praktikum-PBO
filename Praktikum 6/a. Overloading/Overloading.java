/*  Nama File    : Overloading.java
    Deskripsi    : Kelas untuk membuat contoh overloading dengan beberapa jenis dan syaratnya
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

/* PERTANYAAN :
Polimorfisme overloading merupakan satu nama entitas, namun beda signature, beda parameter, 
beda tipe/kelas kembalian, beda perilaku. Dengan syarat nama method harus sama, Urutan parameter berbeda.*/

// Contoh Java Overloading
public class Overloading {
    // Versi 1: Tanpa parameter
    public void kosong() {
        System.out.println("kosong");
    }

    // Versi 2: Satu parameter
    public void kosong(int x) {
        System.out.println("kosong " + x);
    }

    // Versi 3: Dua parameter
    public void kosong(int x, int y) {
        System.out.println("kosong " + x + ", isi " + y);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.kosong();           
        o.kosong(4);         
        o.kosong(4, 3);       
    }
}