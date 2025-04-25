/*  Nama File    : Sewa.java
    Deskripsi    : Kelas untuk mereprensentasikan vehicle, car, dan bus.
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Sewa {
    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 1000);
    }

    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        System.out.println("\nTidak menggunakan method hitungSewa()");
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        System.out.println("\nMenggunakan method hitungSewa()");
        hitungSewa(kendaraan);
        hitungSewa(mobil);     
        hitungSewa(bis);       
    }
}