
/*  Nama File    : Vehicle.java
    Deskripsi    : Superclass yang digunakan untuk merepresentasikan turunan bus dan car.
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Vehicle {
    // method
    public void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        System.out.println("Harga vehicle : " + fare);
    }
}