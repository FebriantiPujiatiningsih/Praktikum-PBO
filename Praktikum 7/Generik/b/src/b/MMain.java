/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

/**
 *
 * @author ASUS
 */
//Febrinti Pujiatiningsih / 24060123120034
import java.util.ArrayList;

public class MMain {
    public static void main(String[] args) {
        Datum<Anabul> d1 = new Datum<>(new Kucing("Kitty"));
        Datum<Anabul> d2 = new Datum<>(new Anjing("Rocky"));
        Datum<Anabul> d3 = new Datum<>(new Burung("Beo"));

        ArrayList<Datum<Anabul>> daftar = new ArrayList<>();
        daftar.add(d1);
        daftar.add(d2);
        daftar.add(d3);

        System.out.println("------ sebelum perubahan -------");
        ContohMetodeGenerik.tampilkanSemua(daftar);
        
        System.out.println("------ mengubah isi d1 menjadi burung cici ------ \n");
        ContohMetodeGenerik.ubahIsi(d1, new Burung("cici"));

        System.out.println("------ setelah perubahan -------");
        ContohMetodeGenerik.tampilkanSemua(daftar);
    }
}