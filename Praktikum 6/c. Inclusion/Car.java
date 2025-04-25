/*  Nama File    : Car.java
    Deskripsi    : Kelas turunan dari Vehicle yang merepresentasikan Car yang sedang berjalan.
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Car extends Vehicle {
    // method
    @Override
    public void calRent (int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil : " + fare);
    }
}