/* Nama File : MGaris.java
 * Deskripsi : Berisi aplikasi file Garis.java
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 18 Februari 2025 */

 public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis(); //Membuat garis G1 ((0,0),(1,1))
        Garis G2 = G1; //Membuat garis G2 seperti G1

        Titik T2 = new Titik(2,1); //Membuat titik T2 (2,3)
        G1.printT1T2(); //Menampilkan T1 dan T2 garis G1
        G1.setT1Garis(new Titik(3, 4)); //Mengubah Titik T1 pada garis menjadi (3,4)
        G1.printT1T2(); //Menampilkan T1 dan T2 garis G1 yang telah di set dengen titik (3,4)
        G1.setT2Garis(T2); //Mengubah titik T2 garis dengan titik T2 yang telah dibuat di atas
        G1.printT1T2(); //Menampilkan T1 dan T2 garis G1 setelah di set
        
        System.out.println("Panjang garis :" + G1.getPanjangGaris()); //Menampilkan panjang garis G1
        System.out.println("Gradien garis :" + G1.getGradien()); //Menampilkan gradien garis G1
        System.out.println("Titik tengah garis :" + G1.getTitikTengah()); //Menampilkan titik tengah garis G1
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2)); //Menampilkan true atau false saat pengecekan apakah garis G1 & G2 sejajar
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2)); //Menampilkan true atau false saat pengecekan apakah garis G1 & G2 saling tegak lurus
        G1.printRumus(); //Menampilkan rumus persamaan yaitu y = mx + c
    }
}