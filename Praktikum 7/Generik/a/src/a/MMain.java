/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

/**
 *
 * @author ASUS
 */
// Febrianti Pujiatiningsih / 24060123120034
import java.util.ArrayList;

public class MMain {
    public static void main(String[] args){
        Anabul h1 = new Kucing("Kitty");
        Anabul h2 = new Anjing("Rocky");
        Anabul h3 = new Burung("Beo");

        Datum<Anabul> d1 = new Datum<>(h1);
        Datum<Anabul> d2 = new Datum<>(h2);
        Datum<Anabul> d3 = new Datum<>(h3);

        ArrayList<Datum<Anabul>> daftarDatum = new ArrayList<>();
        daftarDatum.add(d1);
        daftarDatum.add(d2);
        daftarDatum.add(d3);

        for (Datum<Anabul> d : daftarDatum) {
            d.simulasiPerilaku();
            System.out.println();
        }
    }
}