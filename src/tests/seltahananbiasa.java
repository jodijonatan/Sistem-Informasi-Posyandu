package utama;

public class seltahananbiasa extends seltahanan {
    //atribut
    public String jenisSelTahananBiasa;
    //method 1
    String jenisSelTahananBiasa(String jenis){
        System.out.println("Jenis sel tahanan biasa:"+ jenis);
        String dataSelTahananBiasa= jenis;
        return dataSelTahananBiasa;
    }
    public static void main(String[] args) {
        seltahananbiasa sel1 = new seltahananbiasa();
        sel1.jenisSelTahananBiasa("Besi Anti Medan");

        sel1.tampilkanDataSelTahanan();
    }
}
