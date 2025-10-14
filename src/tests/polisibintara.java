package utama;

public class polisibintara extends polisi {
   //atribut
    public int alamatKantorBintara;
    //method 1
    int alamatKantorBintara(int alamat){
        System.out.println("Alamat kantor bintara :"+ alamat);
        alamatKantorBintara = alamat;
        return alamatKantorBintara;
    } 
    public static void main(String[] args) {
        polisibintara polisi1 = new polisibintara();
        polisi1.alamatKantorBintara("Jl.Kenangan No.14 ,Yogyakarta");

        polisi1.tampilkanDataPolisi();
    }
}
