/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3.pkg6;

/**
 *
 * @author ASUS
 */
public class MainAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> A = new Koleksi<>();
        
        System.out.println("=== Mengisi 10 koleksi anabul acak ===");
        A.add(new Kucing("Kitty"));
        A.add(new Anjing("Owen"));
        A.add(new Burung("Tweety"));
        A.add(new Kucing("Lucky"));
        A.add(new Anjing("Leo"));
        A.add(new Burung("Beo"));
        A.add(new Kucing("Lily"));
        A.add(new Anjing("Rocky"));
        A.add(new Burung("Pipit"));
        A.add(new Kucing("Beby"));
        A.showAll();

        System.out.println("Jumlah anabul dalam koleksi: " + A.getSize());
        
        Anabul anabulKetiga = A.getIsi(2);
        System.out.println("Anabul di indeks ke-2: " + anabulKetiga.getNama());
        anabulKetiga.bersuara();
        
        A.setIsi(1, new Anjing("Bruno"));
        System.out.println("Anabul di indeks 1: " + A.getIsi(1).getNama());
        
        System.out.println("\nMengubah ukuran koleksi");
        System.out.println("Ukuran sebelum perubahan: " + A.getSize());
        A.setSize(5);
        System.out.println("Ukuran setelah perubahan: " + A.getSize());
        
        System.out.println("\n=== Koleksi anabul setelah ukuran diubah ===");
        A.showAll();
        
        Anabul hapus = A.delete();
        System.out.println("Anabul yang dihapus: " + hapus.getNama());
        System.out.println("Ukuran koleksi sekarang: " + A.getSize());
    }
}