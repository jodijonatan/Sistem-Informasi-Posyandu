package utama;

public class pengunjungkeluarga extends pengunjung{
    //atribut
    public int jumlahPengunjungKeluarga;
    //method 1
    int jumlahPengunjungKeluarga(int jumlah){
        System.out.println("Jumlah pengunjung keluarga :"+ jumlah);
        jumlahPengunjungKeluarga = jumlah;
        return jumlahPengunjungKeluarga;
    }
    public static void main(String[] args) {
        pengunjungkeluarga pengunjung1 = new pengunjungkeluarga();
        pengunjung1.jumlahPengunjungKeluarga(25);

        pengunjung1.tampilkanDataPengunjung();

    }
}
