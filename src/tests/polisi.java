package utama;

public class polisi {
    //Atribut
    public String identitasPolisi;
    public String statusPolisi;
    public int ukuranwaktuPolisi;
    public String biologisPolisi;
 
    //method 1
    String namaPolisi(String Nama){
        System.out.println("Nama polisi :"+ identitasPolisi);
        String indentitasPolisi= identitasPolisi;
        return indentitasPolisi;
    }
    //method 2
    String pangkatPolisi(String pangkat){
       System.out.println("pangkatPolisi:"+pangkat);
       String statusPolisi= pangkat;
       return statusPolisi;
    } 
    //method 3
    int umurPolisi(int umur){
        System.out.println("Umur polisi :"+ umur);
        int ukuranwaktuPolisi= umur;
        return ukuranwaktuPolisi;
    }
    //method 4
    String jeniskelaminPolisi(String jenisKelamin){
        System.out.println("Jenis Kelamin polisi :"+ jenisKelamin);
        String biologisPolisi= jenisKelamin;
        return biologisPolisi;
    }
    //method 5
    void tampilkanDataPolisi() {
        System.out.println("=== Data Polisi ===");
        System.out.println("Nama           : " + identitasPolisi);
        System.out.println("Pangkat        : " + statusPolisi);
        System.out.println("Umur           : " + ukuranwaktuPolisi);
        System.out.println("jenisKelamin   : " + biologisPolisi);
        System.out.println("===================");
    }
    public static void main(String[] args) {
      polisi polisi1 = new polisi();
        polosi1.namaPolisi("Supriadi");
        polisi1.pangkatPolisi("Jenderal");
        polisi1.umurPolisi(28);
        polisi1.jeniskelaminPolisi("Pria");

        polisi1.tampilkanDataPolisi();

    }
}
