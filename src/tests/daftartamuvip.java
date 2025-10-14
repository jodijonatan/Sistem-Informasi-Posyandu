package utama;

public class daftartamuvip {
    //atribut
    public String jenisMakananVip;
    //method 1
    String jenisMakananVip(String jenis){
        System.out.println("Jenis makan vip :"+ jenis);
        String jenisMakananVip= jenis;
        return jenisMakananVip;
    } 
    public static void main(String[] args) {
        daftartamuvip tamu1 = new daftartamuvip();
        tamu1.jenisMakananVip("Mewah");

        tamu1.tampilkanDataTamu();
    }
}