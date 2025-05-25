/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3.pkg5;

/**
 *
 * @author ASUS
 */
// Febrianti Pujiatiningsih / 24060123120034
public class KoleksiTest {
    public static void main(String[] args) {
        Koleksi<Character> k = new Koleksi<>(10);
        for (char c = 'A'; c < 'A' + 10; c++) {
            k.add(c);
        }
        k.showAll();
    }
}