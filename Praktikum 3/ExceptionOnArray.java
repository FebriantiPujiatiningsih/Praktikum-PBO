/* File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library jawa
 * Pembuat : Febrianti Pujiatiningsih - 24060123120034
 * Tanggal : Selasa, 4 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code...");
        }
    }
}