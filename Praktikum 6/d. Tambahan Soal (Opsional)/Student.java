/*  Nama File    : Student.java
    Deskripsi    : Kelas turunan dari Person yang merepresentasikan seorang student.
    Pembuat      : Febrianti Pujiatiningsih / 24060123120034
    Tanggal      : 22 April 2025 
*/

public class Student extends Person {
    // konstruktor default
    public Student() {
        super();
    }

    // konstruktor
    public Student(String name) {
        super(name);
    }

    // method
    @Override
    public boolean isAsleep(int hr) { 
        return (2 < hr && 8 > hr);
    }
}