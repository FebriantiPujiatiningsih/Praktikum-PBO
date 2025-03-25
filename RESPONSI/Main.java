/*  Nama File    : Main.java  
    Deskripsi    : Program utama untuk menguji kelas Universitas, Fakultas, CivitasAkademika(Mahasiswa, Karyawan(Dosen, dan Tendik)) 
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 25 Maret 2025  
*/

public class Main {
    public static void main(String[] args) {
        // Objek Fakultas
        Fakultas teknik = new Fakultas("Teknik", 6000000, 7500000);
        Fakultas fsm = new Fakultas("FSM", 8000000, 7800000);
        Fakultas kedokteran = new Fakultas("Kedokteran", 7000000, 8500000);

        // Objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "budi@email.com", "24060123120012", 2, teknik);
        Mahasiswa mhs2 = new Mahasiswa("Febrianti Pujiatiningsih", "febri@email.com", "24060123120034", 4, fsm);
        Mahasiswa mhs3 = new Mahasiswa("Rina Wijaya", "rina@email.com", "24060123120033", 6, kedokteran);

        // Objek Dosen
        Dosen dosen1 = new Dosen("Dr. Andi", "andi@email.com", "197812341234", 12, teknik);
        Dosen dosen2 = new Dosen("Prof. Dewi", "dewi@email.com", "196511221112", 25, fsm);

        // Objek Tendik
        Tendik tendik1 = new Tendik("Pak Joko", "joko@email.com", "198512121212", 10);
        Tendik tendik2 = new Tendik("Bu Rina", "rina@email.com", "199002030303", 8);

        // Menampilkan informasi mahasiswa
        System.out.println("\n=== DATA MAHASISWA ===");
        mhs1.printInfo();
        System.out.println("Biaya UKT: Rp" + mhs1.hitungUKT());
        System.out.println();
        mhs2.printInfo();
        System.out.println("Biaya UKT: Rp" + mhs2.hitungUKT());
        System.out.println();
        mhs3.printInfo();
        System.out.println("Biaya UKT: Rp" + mhs3.hitungUKT());

        // Menampilkan informasi dosen
        System.out.println("\n=== DATA DOSEN ===");
        dosen1.printInfo();
        System.out.println();
        dosen2.printInfo();

        // Menampilkan informasi tendik
        System.out.println("\n=== DATA TENAGA KEPENDIDIKAN (TENDIK) ===");
        tendik1.printInfo();
        System.out.println();
        tendik2.printInfo();
    }
}
