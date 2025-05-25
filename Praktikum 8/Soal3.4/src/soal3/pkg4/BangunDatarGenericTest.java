/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3.pkg4;

/**
 *
 * @author ASUS
 */
// Febrianti Pujiatiningsih / 24060123120034
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        BangunDatarGenerik<?>[] shapes = new BangunDatarGenerik<?>[]{
            new Persegi(5.0),
            new PersegiPanjang(4.0, 6.0),
            new Segitiga(3.0, 4.0, 5.0)
        };
        for (BangunDatarGenerik<?> shape : shapes) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.println("Luas: " + shape.luas());
            System.out.println("Keliling: " + shape.keliling());
            System.out.println();
        }
    }
}