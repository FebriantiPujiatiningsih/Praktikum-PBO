/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat : Febrianti Pujiatiningsih / 24060123120034
 * Tanggal : Selasa, 25 Februari 2025 */

public class Dosen {
    /***************ATRIBUT*************/
    private String nip;
    private String namaDos;
    private String prodi;

    /***************METHOD*************/
    public Dosen(){
        this.nip = "";
        this.namaDos = " ";
        this.prodi = " ";
    }

    //Konstruktor
    public Dosen(String nip, String namaDos, String prodi){
        this.nip = nip;
        this.namaDos = namaDos;
        this.prodi = prodi;
    }
        
    //Selektor(getter)
    public String getnip(){
        return this.nip;
    }

    public String getnamaDos(){
        return this.namaDos;
    }

    public String getprodi(){
        return this.prodi;
    } 

    //Mutator(setter)
    public void setnip(String nip){
        this.nip = nip;
    }

    public void setnamaDos(String namaDos){
        this.namaDos = namaDos;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    
    /*************** METODH *************/
    public void printDosen() {
        System.out.println("\nDetail Dosen Wali:");
        System.out.println("Nama Dosen: " + this.namaDos);
        System.out.println("NIP: " + this.nip);
        System.out.println("Prodi: " + this.prodi);
    }

} //end class Dosen
