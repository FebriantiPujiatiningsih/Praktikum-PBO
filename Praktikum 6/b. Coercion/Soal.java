/*  Nama File    : Soal.java
    Deskripsi    : Kelas untuk mencoba program polimorfisme coercion berdasarkan input yang diberikan.
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Soal {
    public static void main(String[] args) {
        // soal no 1
        int output1 = 'a';
        System.out.println("Soal 1 : " + output1);
        
        // soal no 2
        double x = 15.5;
        // int output2 = x;     error karena harus mengubah x menjadi int terlebih dahulu agar bisa dibaca.
        int output2 = (int) x;  // x sudah diubah menjadi int
        System.out.println("Soal 2 : " + output2);

        // soal no 3
        int y = 25;
        double output3 = y;
        System.out.println("Soal 3 : " + output3);

        // soal no 4
        int z = 78;
        char output4 = (char) z;
        System.out.println("Soal 4 : " + output4);

        // soal no 5
        char a = 'a';
        double output5 = a;
        System.out.println("Soal 5 : " + output5);
    }
}