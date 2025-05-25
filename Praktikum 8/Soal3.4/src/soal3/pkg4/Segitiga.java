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
public class Segitiga extends BangunDatarGenerik<double[]> {
    public Segitiga(double a, double b, double c) {
        super(new double[]{a, b, c});
    }
    @Override
    public double luas() {
        double a = value[0], b = value[1], c = value[2];
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double keliling() {
        return value[0] + value[1] + value[2];
    }
}