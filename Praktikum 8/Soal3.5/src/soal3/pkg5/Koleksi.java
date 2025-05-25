/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3.pkg5;

/**
 *
 * @author ASUS
 */
// Febrianti Pujiatiningsih / 24060123120034
public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah[index];
        }
        return null;
    }

    public void setIsi(int index, T value) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = value;
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        if (size >= 0 && size <= wadah.length) {
            nbelm = size;
        }
    }

    public void add(T value) {
        if (nbelm < wadah.length) {
            wadah[nbelm++] = value;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[--nbelm] = null;
        }
    }

    public void showAll() {
        System.out.println("Isi koleksi (" + nbelm + " elemen):");
        for (int i = 0; i < nbelm; i++) {
            System.out.println(wadah[i]);
        }
    }
}