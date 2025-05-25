/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author ASUS
 */
// Febrianti Pujiatiningsih / 24060123120034
public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran L = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        
        bdg.set(L);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        
        System.out.println("Tipe generik: " + bdg.get().getClass().getSimpleName());
    }
}