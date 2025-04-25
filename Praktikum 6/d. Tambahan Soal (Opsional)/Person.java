/*  Nama File    : Person.java
    Deskripsi    : Kelas untuk merepresentasikan person yang memiliki nama dan status aktivitas berdasarkan waktu (jam).
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Person {
    // atribut
    private String name;

    // konstruktor default
    public Person() {
        this.name = " ";
    }

    // konstruktor
    public Person(String name) {
        this.name = name;
    }

    // method
    public boolean isAsleep(int hr) {
        return (22 < hr || 7 > hr);
    }

    public String toString() {
        return name;
    }

    public void status(int hr) {
        if (this.isAsleep(hr)) {
            System.out.println("Offline : " + this.name);
        }
        else {
            System.out.println("Online : " + this.name);
        }
    }
}