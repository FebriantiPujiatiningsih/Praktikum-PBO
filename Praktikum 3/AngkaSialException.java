/* File : AngkaSialException.java
 * Deskripsi : Ekspresi buatan sendiri, menolak masukan angka 13!
 * Pembuat : Febrianti Pujiatiningsih - 24060123120034
 * Tanggal : Selasa, 4 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}