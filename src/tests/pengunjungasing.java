package utama;

public class pengunjungasing extends pengunjung{
    //atribut
    public int jumlahPengunjungAsing;
    //method 1
    int jumlahPengunjungAsing(int jumlah){
        System.out.println("Jumlah pengunjung asing:"+ jumlah);
        jumlahPengunjungAsing = jumlah;
        return jumlahPengunjungAsing;
    }
    public static void main(String[] args) {
        pengunjungasing pengunjung1 = new pengunjungasing();
        pengunjung1.jumlahPengunjungAsing(10);

        pengunjung11.tampilkanDataPengunjung();

    }
}