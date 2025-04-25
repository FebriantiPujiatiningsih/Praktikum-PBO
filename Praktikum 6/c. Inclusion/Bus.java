/*  Nama File    : Bus.java
    Deskripsi    : Kelas turunan dari Vehicle yang merepresentasikan Bus yang sedang berjalan.
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Bus extends Vehicle {
    // method
    @Override
    public void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 50.00f;
        System.out.println("Harga sewa bus : " + fare);
    }
}