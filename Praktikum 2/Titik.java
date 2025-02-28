/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 18 Februari 2025 */

 public class Titik {
    /*****************ATRIBUT****************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*****************METHOD*****************/
    //Mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //Konstruktor untuk membuat titik (0,0)
    public Titik (double x, double y) {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        this.absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        this.ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        this.absis = absis + x;
        this.ordinat = ordinat + x;
    }

    //Menentukan kuadran titik
    public int getKuadran(){
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
    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //Menghitung jarak dari titik lain
    public double getJarak(Titik T){
        double dx = this.absis - this.absis;
        double dy = this.ordinat - this.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //Melakukan refleksi terhadap sumbu X (mengubah ordinat menjadi negatif)
    public void refleksiX() {
        this.ordinat = ordinat * (-1);
    }

    //Melakukan refleksi terhadap sumbu Y (mengubah absis menjadi negatif)
    public void refleksiY() {
        this.absis = absis * (-1);
    }

    //Mengembalikan titik hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    //Mengembalikan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    //Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //Mencetak counter titik
    public void printCounterTitik(){
        System.out.println(counterTitik);
    }
} //end class Titik