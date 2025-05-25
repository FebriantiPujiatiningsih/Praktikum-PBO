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
public class PersegiPanjang extends BangunDatarGenerik<double[]> {
    public PersegiPanjang(double panjang, double lebar) {
        super(new double[]{panjang, lebar});
    }
    @Override
    public double luas() {
        return value[0] * value[1];
    }
    @Override
    public double keliling() {
        return 2 * (value[0] + value[1]);
    }
}