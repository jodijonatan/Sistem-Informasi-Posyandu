package utama;

public class seltahanankhusus extends seltahanan{
    //atribut
    public String jenisSelTahananKhusus;
    //method 1
    String jenisSelTahananKhusus(String jenis){
        System.out.println("Jenis sel tahanan khusus:"+ jenis);
        String dataSelTahananKhusus= jenis;
        return dataSelTahananKhusus;
    }
    public static void main(String[] args) {
        seltahanankhusus sel1 = new seltahanankhusus();
        sel1.jenisSelTahananKhusus("Besi Anti Karat");

        sel1.tampilkanDataSelTahanan();
    }
}
