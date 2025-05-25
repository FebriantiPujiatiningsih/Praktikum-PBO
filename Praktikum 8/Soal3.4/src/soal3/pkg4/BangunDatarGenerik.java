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
public abstract class BangunDatarGenerik<T> {
    protected T value;
    public BangunDatarGenerik(T data) {
        this.value = data;
    }
    public abstract double luas();
    public abstract double keliling();
}