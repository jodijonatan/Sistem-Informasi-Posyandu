package utama;

public class daftartamu {
    // Atribut
    public String identitasTamu;
    public int dataNik;
    public String dataAlamat;
    public int informasiTelepon;

    // Method 1
    String namaTamu(String Nama) {
        System.out.println("Nama tamu : " + Nama);
        identitasTamu = Nama;
        return identitasTamu;
    }

    // Method 2
    int nikTamu(int Niktamu) {
        System.out.println("Nomor Nik tamu : " + Niktamu);
        dataNik = Niktamu;
        return dataNik;
    }

    // Method 3
    String alamatTamu(String alamat) {
        System.out.println("Alamat tamu : " + alamat);
        dataAlamat = alamat;
        return dataAlamat;
    }

    // Method 4
    int teleponTamu(int noTelepon) {
        System.out.println("Nomor Telepon tamu : " + noTelepon);
        informasiTelepon = noTelepon;
        return informasiTelepon;
    }

    // Method 5
    void tampilkanDataTamu() {
        System.out.println("=== Data Tamu ===");
        System.out.println("Nama       : " + identitasTamu);
        System.out.println("No NIK     : " + dataNik);
        System.out.println("Alamat     : " + dataAlamat);
        System.out.println("No Telepon : " + informasiTelepon);
        System.out.println("==================");
    }
    public static void main(String[] args) {
        daftartamu tamu1 = new daftartamu();
        tamu1.namaTamu("agus antoso");
        tamu1.nikTamu(489);
        tamu1.alamatTamu("Jl.Bahagia No. 5, Jakarta");
        tamu1.teleponTamu(20348721) ;

        tamu1.tampilkanDataTamu();

    }
}

