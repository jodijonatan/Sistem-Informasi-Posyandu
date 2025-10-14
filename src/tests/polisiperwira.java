package utama;

public class polisiperwira extends polisi {
    //atribut
    public int alamatKantorPerwira;
    //method 1
    int alamatKantorPerwira(int alamat){
        System.out.println("Alamat kantor perwira :"+ alamat);
        alamatKantorPerwira = alamat;
        return alamatKantorPerwira;
    } 
    public static void main(String[] args) {
        polisiperwira polisi1 = new polisiperwira();
        polisi1.alamatKantorPerwira("Jl.sukasuka No.78 ,Bekasi");

        polisi1.tampilkanDataPolisi();
    }
}

