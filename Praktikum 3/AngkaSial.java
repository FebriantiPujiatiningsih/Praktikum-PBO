/* File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Pembuat : Febrianti Pujiatiningsih - 24060123120034
 * Tanggal : Selasa, 4 Maret 2025
 */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*PERTANYAAN:
1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
Jelaskan pada lembar praktikum anda ! */

/* JAWABAN :
 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
Tidak, baris 12 tidak dieksekusi. Ketika metode cobaAngka(13); dipanggil, kondisi if 
(angka == 13) terpenuhi, sehingga program mengeksekusi pernyataan throw new AngkaSialException();.
Setelah eksepsi dilempar, eksekusi metode langsung dihentikan, 
sehingga pernyataan System.out.println("angka+" bukan angka sial"); pada baris 12 tidak dijalankan.

2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Tidak, baris 21 juga tidak dieksekusi. Setelah eksepsi terjadi pada pemanggilan cobaAngka(13);,
program langsung melompat ke blok catch, sehingga eksekusi cobaAngka(12); yang berada setelahnya 
tidak dilakukan. Dalam blok try, jika terjadi eksepsi, semua kode setelah eksepsi tidak akan dijalankan,
dan program langsung menangani eksepsi di dalam blok catch.
 */