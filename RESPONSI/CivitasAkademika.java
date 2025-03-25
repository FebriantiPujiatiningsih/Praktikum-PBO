/*  Nama File    : CivitasAkademika.java  
    Deskripsi    : Kelas abstrak untuk merepresentasikan civitas akademika dalam universitas  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 25 Maret 2025  
*/

public abstract class CivitasAkademika {
    protected String nama;
    protected String email;
    protected static int jumlahCivitas = 0; 

    // Konstruktor default
    public CivitasAkademika() {
        this.nama = "";
        this.email = "";
    }

    // Konstruktor
    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        jumlahCivitas++; 
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getJumlahCivitas() {
        return jumlahCivitas;
    }

    // Method abstrak untuk menampilkan informasi civitas
    public abstract void printInfo();

    // Method tambahan untuk mencetak jumlah civitas akademika
    public static void printJumlahCivitas() {
        System.out.println("Total Civitas Akademika: " + jumlahCivitas);
    }
}