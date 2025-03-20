/* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class MataKuliah
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 25 Februari 2025 */

public class MataKuliah {
    /**************ATRIBUT**********/
    private String idMatkul;
    private String namaMatkul;
    private int sks;

    /*************METHOD************/
    public MataKuliah(){
        this.idMatkul = " ";
        this.namaMatkul = " ";
        this.sks = 0;
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String namaMatkul, int sks){
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }
    
    //Selektor(getter)
    public String getidMatkul(){
        return this.idMatkul;
    }

    public String getnamaMatkul(){
        return this.namaMatkul;
    }

    public int getsks(){
        return this.sks;
    } 

    //Mutator(setter)
    public void setidMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setnamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }

    public void setsks(int sks){
        this.sks = sks;
    }

    /************* METHOD ************/
    public void printMatKul() {
        System.out.println(this.idMatkul + " - " + this.namaMatkul + " (" + this.sks + " SKS)");
    }
}
