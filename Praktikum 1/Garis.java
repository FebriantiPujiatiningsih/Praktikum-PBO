/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 18 Februari 2025 */

 public class Garis {
    /*****************ATRIBUT****************/
    Titik T1;
    Titik T2;
    static int CounterGaris = 0;

    /*****************METHOD*****************/
    //Mengembalikan nilai counterGaris
    static int getCounterGaris(){
        return CounterGaris;
    }

    //Konstruktor untuk membuat garis ((x1,y1),(x2,y2))
    Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        CounterGaris++;
    }

    //Konstruktor untuk membuat garis ((0,0),(1,1))
    Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    //Mengembalikan nilai T1
    Titik getT1Garis() {
        return this.T1;
    }

    //Mengembalikan nilai T2
    Titik getT2Garis() {
        return this.T2;
    }

    //Mengeset titik T1 Garis 
    void setT1Garis(Titik T1) {
        this.T1 = T1;
    }

    //Mengeset titik T2 Garis
    void setT2Garis(Titik T2) {
        this.T2 = T2;
    }

    //Mengembalikan nilai panjang garis
    double getPanjangGaris() {
        return Math.sqrt(Math.pow(T1.absis - T2.absis, 2) + Math.pow(T1.ordinat - T2.ordinat, 2));
    }

    //Mengembalikan nilai gradien garis
    double getGradien() {
        double X = T1.getAbsis() - T2.getAbsis();
        if (X == 0) {
            System.out.println("Nilai x1 dan x2 sama, pembagian nol");
        }
        return (T1.getOrdinat() - T2.getOrdinat()) / X;
    }

    //Mengembalikan titik tengah garis
    Titik getTitikTengah() {
        return new Titik((this.T1.getAbsis() + this.T2.getAbsis()) / 2, (this.T1.getOrdinat() + this.T2.getOrdinat()) / 2);
    }

    //Mengecek apakah garis sejajar dengan garis X, jika benar true dan jika salah false
    boolean isSejajar(Garis X) {
        return this.getGradien() == X.getGradien();
    }

    //Mengecek apakah garis G tegak lurus dengan garis X
    boolean isTegakLurus(Garis X) {
        return (this.getGradien() * X.getGradien()) == (-1);
    }

    //Menampilkan ke layar titik awal dan titik akhir garis
    void printT1T2() {
        System.out.println("Titik awal (" + T1.absis + "," + T1.ordinat + "), Titik akhir (" + T2.absis + ", " + T2.ordinat + ")");
    }

    //Menampilkan persamaan garis dalam bentuk string y = mx + c.
    void printRumus() {
        double m = (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
        double c = T1.getOrdinat() - (m * T1.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
} //end class Garis