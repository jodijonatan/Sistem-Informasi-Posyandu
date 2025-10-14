package utama;

public class pengunjung {
    //Atribut
    public String dataAlamat;
    public String identitasPengunjung;
    public String keperluanPengunjung;
    public int informasiwaktuKunjungan; 

    //method 1
    String alamatPengunjung(String alamat){
        System.out.println("Alamat pengunjung :"+alamat);
        String dataAlamat= alamat;
        return dataAlamat ;
    }
     //method 2
    String namaPengunjung(String Nama){
        System.out.println("Nama pengunjung :"+ identitasPengunjung);
        String indentitasPengunjung= identitasPengunjung;
        return indentitasPengunjung;
    }
      //method 3
    String tujuanPengunjung(String tujuan){
        System.out.println("Tujuan pengunjung :"+tujuan);
        String keperluanPengunjung= tujuan;
        return keperluanPengunjung ;
    }
    //method 4
    int waktuKunjungan(int waktuKunjungan){
        System.out.println("Waktu Kunjungan :"+waktuKunjungan);
        int informasiwaktuKunjungan= waktuKunjungan;
        return informasiwaktuKunjungan ;
    }
    //method 5
    void tampilkanDataPengunjung() {
        System.out.println("=== Data Pengunjung ===");
        System.out.println("Alamat          : " + dataAlamat);
        System.out.println("Nama            : " + identitasPengunjung);
        System.out.println("Tujuan          : " + keperluanPengunjung);
        System.out.println("Waktu Kunjungan : " + informasiwaktuKunjungan);
        System.out.println("========================");

    }
    public static void main(String[] args) {
       pengunjung pengunjung1 = new pengunjung();
        pengunjung1.alamatPengunjung("Jl.Sadboy No.111,Bandung");
        pengunjung1.namaPengunjung("BUdi Baik");
        pengunjung1.tujuanPengunjung("Menjenguk rinduuu");
        pengunjung1.waktuKunjungan(12.00);

        pengunjung11.tampilkanDataPengunjung();
    }
}