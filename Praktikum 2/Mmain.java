public class Mmain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("D001", "Dr. Bani", "Informatika");
        Dosen dosen2 = new Dosen("D002", "Dr. Ali", "Sistem Informasi");
        Dosen dosen3 = new Dosen("D003", "Dr. Yuni", "Matematika");

        MataKuliah matkul1 = new MataKuliah("MK001", "Basis Data", 4);
        MataKuliah matkul2 = new MataKuliah("MK002", "Sistem Cerdas", 3);
        MataKuliah matkul3 = new MataKuliah("MK003", "Aljabar Linear", 2);

        Kendaraan kendaraan1 = new Kendaraan("K102AR", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan("H102TR", "Motor");

        Mahasiswa mhs1 = new Mahasiswa("24060123120034", "Febri", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("24060123120011", "Cia", "Sistem Informasi");
        Mahasiswa mhs3 = new Mahasiswa("24060123140111", "Agung", "Matematika");
        mhs1.setDosenWali(dosen1);
        mhs2.setDosenWali(dosen2);
        mhs3.setDosenWali(dosen3);

        mhs1.setKendaraan(kendaraan1);
        mhs2.setKendaraan(kendaraan2);
        mhs3.setKendaraan(kendaraan2);

        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);

        mhs2.addMatKul(matkul1);
        mhs2.addMatKul(matkul3);

        mhs3.addMatKul(matkul3);

        System.out.println("\n============= Data Mahasiswa ===============");
        mhs1.printDetailMhs();
        System.out.println("==============================================");
        mhs2.printDetailMhs();
        System.out.println("==============================================");
        mhs3.printDetailMhs();
    }
}