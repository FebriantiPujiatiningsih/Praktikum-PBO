/*  Nama File    : Programmer.java
    Deskripsi    : Kelas untuk menentukan informasi programmer turunan pegawai
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Programmer extends Pegawai {
    // atribut
    private int bonus = 450000;

    // konstruktor default
    public Programmer() {
        super();
        this.bonus = 0;
    }

    // konstruktor
    public Programmer(String nama) {
        super(nama, 5000000);
        this.bonus = 450000;
    }

    // setter
    public void setBonus(int bonus) {
        this.bonus = bonus;
    } 

    // getter
    public int getBonus() {
        return bonus;
    }

    @Override
    // method
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}