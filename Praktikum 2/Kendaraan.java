public class Kendaraan {
    /**************ATRIBUT**********/
    private String noPlat;
    private String jenis;

    /*************METHOD************/
    public Kendaraan(){
        this.noPlat = " ";
        this.jenis = " ";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    
    //Selektor(getter)
    public String getnoPlat(){
        return this.noPlat;
    }

    public String getjenis(){
        return this.jenis;
    }

    //Mutator
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setNama(String jenis){
        this.jenis = jenis;
    }

    /************* METODE TAMBAHAN ************/
    public void printKendaraan() {
        System.out.println("\nDetail Kendaraan:");
        System.out.println("Plat Kendaraan: " + this.noPlat);
        System.out.println("Jenis Kendaraan: " + this.jenis);
    }
}