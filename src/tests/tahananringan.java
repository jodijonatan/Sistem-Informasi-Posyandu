package utama;

public class tahananringan extends tahanan {
    //atribut
    public String jenisTahananRingan;
    //method 1
    String jenisTahananRingan(String jenis){
        System.out.println("Jenis tahanan ringan:"+ jenis);
        String jenisTahananRingan= jenis;
        return jenisTahananRingan;
    }
    public static void main(String[] args) {
        tahananringan tahanan1 = new tahanan1();
        tahanan1.jenisTahananRingan("balap balap");
    }
}
