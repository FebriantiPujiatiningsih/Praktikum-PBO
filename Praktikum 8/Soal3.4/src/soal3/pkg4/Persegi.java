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
public class Persegi extends BangunDatarGenerik<Double> {
    public Persegi(Double sisi) {
        super(sisi);
    }
    @Override
    public double luas() {
        return value * value;
    }
    @Override
    public double keliling() {
        return 4 * value;
    }
}