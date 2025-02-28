/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 18 Februari 2025 */

 public class Garis {
    /*****************ATRIBUT****************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int CounterGaris = 0;

    /*****************METHOD*****************/
    //Mengembalikan nilai counterGaris
    public int getCounterGaris(){
        return CounterGaris;
    }

    //Konstruktor untuk membuat garis ((x1,y1),(x2,y2))
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        CounterGaris++;
    }

    //Konstruktor untuk membuat garis ((0,0),(1,1))
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    //Mengembalikan nilai titikAwal
    public Titik gettitikAwalGaris() {
        return this.titikAwal;
    }

    //Mengembalikan nilai titikAkhir
    public Titik gettitikAkhirGaris() {
        return this.titikAkhir;
    }

    //Mengeset titik titikAwal Garis 
    public void settitikAwalGaris(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    //Mengeset titik titikAkhir Garis
    public void settitikAkhirGaris(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    //Mengembalikan nilai panjang garis
    public double getPanjangGaris() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    //Mengembalikan nilai gradien garis
    public double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        if (Math.abs(deltaX) < 1e-9) {
            return Double.POSITIVE_INFINITY;
        }
        return deltaY / deltaX;
    }

    //Mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        return new Titik(
            (this.titikAwal.getAbsis() + this.titikAkhir.getAbsis()) / 2,
            (this.titikAwal.getOrdinat() + this.titikAkhir.getOrdinat()) / 2
        );
    }

    //Mengecek apakah garis sejajar dengan garis X, jika benar true dan jika salah false
    public boolean isSejajar(Garis X) {
        return this.getGradien() == X.getGradien();
    }

    //Mengecek apakah garis G tegak lurus dengan garis X
    public boolean isTegakLurus(Garis X) {
        return (this.getGradien() * X.getGradien()) == (-1);
    }

    //Menampilkan ke layar titik awal dan titik akhir garis
    public void printtitikAwaltitikAkhir() {
        System.out.println("Titik awal (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + "), Titik akhir (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    //Menampilkan persamaan garis dalam bentuk string y = mx + c.
    public void printRumus() {
        double m = (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
} //end class Garis