package utama;

public class daftartamureguler extends daftartamu  {
    //atribut
    public String jenisMakananReguler;
    //method 1
    String jenisMakananReguler(String jenis){
        System.out.println("Jenis makan reguler :"+ jenis);
        String jenisMakananReguler= jenis;
        return jenisMakananReguler;
    } 
    public static void main(String[] args) {
        daftartamureguler tamu1 = new daftartamureguler();
        tamu1.jenisMakananReguler("Biasa");

        tamu1.tampilkanDataTamu();

    }
     
}
