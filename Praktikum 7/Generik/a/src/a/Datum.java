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
public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }

    // Simulasikan perilaku jika T adalah Anabul
    public void simulasiPerilaku() {
        if (isi instanceof Anabul) {
            Anabul hewan = (Anabul) isi;
            hewan.bersuara();
            hewan.gerak();
        } else {
            System.out.println("Bukan objek Anabul.");
        }
    }
}