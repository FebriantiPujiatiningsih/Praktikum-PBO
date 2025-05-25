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
import java.util.List;

public class ContohMetodeGenerik {

    public static <T extends Anabul> void tampilkanSemua(List<Datum<T>> daftarDatum) {
        for (Datum<T> d : daftarDatum) {
            d.simulasiPerilaku();
        }
    }

    public static <T> void ubahIsi(Datum<T> datum, T baru) {
        datum.setIsi(baru);
    }
}