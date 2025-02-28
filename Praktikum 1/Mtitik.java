/* Nama File : MTitik.java
 * Deskripsi : Berisi aplikasi file Titik.java
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 18 Februari 2025 */

 public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //Menampilkan koordinat T1
        T1.geser(3,4); //Menggeser T1 sejauh (3,4)
        T1.printTitik(); //Menampilkan koordinat T1 setelah digeser

        Titik T2 = T1; //Membuat objek titik T2 yang bernilai sama dengan T1
        T2.printTitik(); //Menampilkan koordinat T2
        T1.setAbsis(10); //Mengeset absis T1 dengan nilai 10
        T1.setOrdinat(10); //Mengeset ordinat T1 dengan nilai 10
        T2.printTitik(); //Menampilkan koordinat T2

        System.out.println("Berada di kuadran: " + T1.getKuadran()); //Menampilkan titik T1 berada kuadran berapa
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat()); //Menampilkan jarak titik T1 dengan pusat(0,0)
        System.out.println("Jarak ke pusat: " + T1.getJarak(T2)); //Menampilkan jarak titik T1 dengan T2

        T1.refleksiX(); //Merefleksikan titik pada sumbu x
        T1.printTitik(); //Menampilkan koordinat T1
        T1.refleksiY(); //Merefleksikan titik pada sumbu y
        T1.printTitik(); //Menampilkan koordinat T1
        System.out.println("Berada di kuadran: " + T1.getKuadran()); //Menampilkan titik T1 berada pada kuadran mana
        Titik reflekX = T1.getRefleksiX(); //Membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu X
        reflekX.printTitik(); //Menampilkan koordinat refleksiX 
        Titik reflekY = T1.getRefleksiY(); //Membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu y
        reflekY.printTitik();  //Menampilkan koordinat refleksiY ke layar

        // Titik T3 = new Titik(); //Membuat objek titik T3 (0,0)
        // Titik T4 = new Titik(3,5); //Membuat objek titik T4 (3,5)

        // System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik()); //Menampilkan jumlah objek titik
        // System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik()); //Menampilkan jumlah objek titik T4
    }
}