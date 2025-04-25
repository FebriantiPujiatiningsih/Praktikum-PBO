/*  Nama File    : MainAnabul.java
    Deskripsi    : Kelas untuk menguji penerapan polimorfisme pada objek-objek turunan dari kelas Anabul, yaitu Kucing, Anjing, dan Burung.  
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 23 April 2025 
*/

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        System.out.println("Nama : Febrianti Pujiatiningsih");
        System.out.println("Nim  : 24060123120034\n");
        Anabul h1 = new Kucing("Kitty");
        Anabul h2 = new Anjing("Rocket");
        Anabul h3 =  new Burung("Bobi");

        ArrayList<Anabul> peliharaan = new ArrayList<>();

        peliharaan.add(h1);
        peliharaan.add(h2);
        peliharaan.add(h3);

        for (Anabul a : peliharaan) {
            a.bersuara();
            a.gerak();
            System.out.println(); 
        }
    }
}