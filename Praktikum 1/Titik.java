/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 18 Februari 2025 */

 public class Titik {
    /*****************ATRIBUT****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*****************METHOD*****************/
    //Mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //Konstruktor untuk membuat titik (0,0)
    Titik (double x, double y) {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        this.absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        this.ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        this.absis = absis + x;
        this.ordinat = ordinat + x;
    }

    //Menentukan kuadran titik
    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        if (absis > 0 && ordinat < 0){
            return 4;
        }
        return 0;
    }

    //Menghitung jarak dari pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //Menghitung jarak dari titik lain
    double getJarak(Titik T){
        double dx = this.absis - this.absis;
        double dy = this.ordinat - this.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //Melakukan refleksi terhadap sumbu X (mengubah ordinat menjadi negatif)
    void refleksiX() {
        this.ordinat = ordinat * (-1);
    }

    //Melakukan refleksi terhadap sumbu Y (mengubah absis menjadi negatif)
    void refleksiY() {
        this.absis = absis * (-1);
    }

    //Mengembalikan titik hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    //Mengembalikan titik hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    //Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //Mencetak counter titik
    void printCounterTitik(){
        System.out.println(counterTitik);
    }
} //end class Titik