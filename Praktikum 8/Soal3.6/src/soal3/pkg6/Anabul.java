/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3.pkg6;

/**
 *
 * @author ASUS
 */
abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nama + " (" + this.getClass().getSimpleName() + ")";
    }

    public abstract void bergerak();
    public abstract void bersuara();
}