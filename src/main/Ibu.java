package main;

public class Ibu {
    public String nama;
    public Integer umur;
    public String tanggalLahir;
    public String kota;
    public String negara;
    private Anak anak;

    public void tampilkanInfoIbu() {
        System.out.println("Nama Ibu: " + nama);
        System.out.println("Umur Ibu: " + umur);
        System.out.println("Alamat: " + kota + ", " + negara);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }

    public void sapaIbu() {
        System.out.println("Halo, " + nama + "! Selamat datang di Posyandu!");
    }

    public void setAnak(Anak anak) {
        this.anak = anak;
    }

    public void tampilkanInfoAnak() {
        if (this.anak != null) {
            this.anak.tampilkanInfoAnak();
        } else {
            System.out.println("Belum ada anak yang terdaftar.");
        }
    }
}
