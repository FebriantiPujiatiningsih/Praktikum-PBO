/* File : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat : Febrianti Pujiatiningsih - 24060123120034
 * Tanggal : Selasa, 4 Maret 2025
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan pada lembar laporan praktikum!

/*JAWABAN : Program Asersi2.java memiliki beberapa kesalahan konseptual. Pertama, asersi assert(jariJari > 0); hanya berjalan 
jika dijalankan dengan opsi -enableassertions, sehingga jika tidak diaktifkan, program tetap dapat membuat objek Lingkaran 
dengan jari-jari nol. Kedua, validasi sebaiknya dilakukan dalam konstruktor Lingkaran agar tidak ada objek dengan nilai tidak valid, 
misalnya dengan assert jariJari > 0; di dalam konstruktor. Ketiga, jika ingin validasi selalu berlaku tanpa bergantung pada asersi, 
lebih baik menggunakan if dan throw new IllegalArgumentException(...). Dengan adanya perbaikan ini, program dapat mencegah input 
jari-jari nol secara lebih efektif. 
*/