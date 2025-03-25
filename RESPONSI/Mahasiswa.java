/*  Nama File    : Mahasiswa.java  
    Deskripsi    : Kelas yang merepresentasikan mahasiswa dalam universitas  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034  
    Tanggal      : 25 Maret 2025  
*/

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int jumlahMahasiswa = 0; 

    // Konstruktor default
    public Mahasiswa() {
        super();
        this.NIM = "";
        this.semester = 0;
        this.fakultas = new Fakultas();
    }

    // Konstruktor
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        jumlahMahasiswa++;
    }

    // Getter & Setter
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    // Method 
    public double hitungUKT() {
        double pengurangan = 0.05 * (semester - 1); // Pengurangan 5% per semester setelah semester pertama
        double ukt = fakultas.getTarifUkt() * (1 - pengurangan);
        return (int) ukt; 
    }

    @Override
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
    }

    // Method untuk mencetak jumlah mahasiswa
    public static void printJumlahMahasiswa() {
        System.out.println("Total Mahasiswa: " + jumlahMahasiswa);
    }
}