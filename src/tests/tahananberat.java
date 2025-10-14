package utama;

public class tahananberat extends tahanan{
    //atribut
    public String jenisTahananBerat;
    //method 1
    String jenisTahananBerat(String jenis){
        System.out.println("Jenis tahanan berat:"+ jenis);
        String jenisTahananBerat= jenis;
        return jenisTahananBerat;
    }
    public static void main(String[] args) {
        tahananberat tahanan1 = new tahanan();
        tahanan1.jenisTahananBerat("Terorisme");

        tahanan1.tampilkanDataTahananBerat();
    }
}
