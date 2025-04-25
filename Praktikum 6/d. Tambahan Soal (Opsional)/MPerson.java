/*  Nama File    : MPerson.java
    Deskripsi    : Kelas untuk menguji dan merepresentasikan person.
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class MPerson {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}


/* PERTANYAAN
   Apakah “this” pada kelas person dalam method status dieksekusi ketika compile time atau runtime?

   JAWAB :
   Hasil output tersebut terjadi karena method status() di kelas Person memanggil method isAsleep() 
   menggunakan keyword this, yang merujuk pada objek Student saat program dijalankan. Meskipun variabel 
   p yang dideklarasikan sebagai Person, objek yang sebenarnya dibuat adalah Student, sehingga method isAsleep() 
   milik Student yang akan dijalankan. Hal ini menunjukkan bahwa pemanggilan method terjadi secara dinamis pada 
   saat program dijalankan (runtime), bukan saat dikompilasi (compile time), sesuai dengan konsep polimorfisme
    dan dynamic binding dalam OOP.
 */