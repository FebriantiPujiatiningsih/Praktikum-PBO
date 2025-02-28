/* Nama File : MGaris.java
 * Deskripsi : Berisi aplikasi file Garis.java
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 18 Februari 2025 */

 public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(10,3);
        Titik T2 = new Titik(6, 7);
        Garis G1 = new Garis(T1, T2); //Membuat garis G1 ((0,0),(1,1))
        Garis G2 = G1; //Membuat garis G2 seperti G1
        
        System.out.println("Panjang garis :" + G1.getPanjangGaris()); //Menampilkan panjang garis G1
        System.out.println("Gradien garis :" + G1.getGradien()); //Menampilkan gradien garis G1
        System.out.println("Titik tengah garis :" + G1.getTitikTengah()); //Menampilkan titik tengah garis G1
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2)); //Menampilkan true atau false saat pengecekan apakah garis G1 & G2 sejajar
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2)); //Menampilkan true atau false saat pengecekan apakah garis G1 & G2 saling tegak lurus
        G1.printRumus(); //Menampilkan rumus persamaan yaitu y = mx + c
    }
}