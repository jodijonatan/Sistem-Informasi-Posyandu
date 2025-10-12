package utama;

public class Anak {
    public String nama;
    public Integer umur;
    public String tanggalLahir;
    public String kota;
    public String negara;
    private DataKesehatan dataKesehatan;

    // method 1
    public void tampilkanInfoAnak() {
        System.out.println("Nama Anak: " + nama);
        System.out.println("Umur Anak: " + umur);
        System.out.println("Alamat: " + kota + ", " + negara);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }

    // method 2
    public void sapaAnak() {
        System.out.println("Halo, " + nama + "! Selamat datang di Posyandu!");
    }

    // method 3
    public void setKesehatan(DataKesehatan data) {
        this.dataKesehatan = data;
    }

    // method 4
    public DataKesehatan getKesehatan() {
        return this.dataKesehatan;
    }

    public void tampilkanDataAnak () {
        System.out.println("=== Data Anak ===");
        System.out.println("Nama          : " + nama);
        System.out.println("Umur          : " + umur);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("Alamat        : " + kota + " " + negara);
        System.out.println("==================");
    }

    public static void main(String[] args) {
        Anak diego = new Anak();
        diego.nama = "Diego";
        diego.umur = 16;
        diego.tanggalLahir = "24 Januari 2009";
        diego.kota = "Medan";
        diego.negara = "Indonesia";
        Diego.tampilkanInfoAnak();
        Diego.sapaAnak();
        
        Diego.setKesehatan(KesehatanDiego);
    }
}

