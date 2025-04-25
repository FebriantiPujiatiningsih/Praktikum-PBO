/*  Nama File    : Manajer.java
    Deskripsi    : Kelas untuk menentukan informasi manajer turunan pegawai
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

class Manajer extends Pegawai {
    // atribut
    private int tunjangan = 700000;

    // konstruktor default
    public Manajer () {
        super();
        this.tunjangan = 0;
    }

    // konstruktor 
    public Manajer(String nama) {
        super(nama, 5000000);
        this.tunjangan = 700000;
    }

    // setter
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // getter
    public int getTunjangan() {
        return tunjangan;
    }

    @Override
    // method
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}