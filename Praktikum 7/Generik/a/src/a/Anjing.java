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
class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " merayap dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: guk-guk");
    }
}