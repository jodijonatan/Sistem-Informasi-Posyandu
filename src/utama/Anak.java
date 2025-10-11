package utama;

public class Anak {
    public String nama;
    public Integer umur;
    public String tanggalLahir;
    public String kota;
    public String negara;
    private DataKesehatan dataKesehatan;

    public void tampilkanInfoAnak() {
        System.out.println("Nama Anak: " + nama);
        System.out.println("Umur Anak: " + umur);
        System.out.println("Alamat: " + kota + ", " + negara);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }

    public void sapaAnak() {
        System.out.println("Halo, " + nama + "! Selamat datang di Posyandu!");
    }

    public void setKesehatan(DataKesehatan data) {
        this.dataKesehatan = data;
    }

    public DataKesehatan getKesehatan() {
        return this.dataKesehatan;
    }
}

