package main;

public class Ibu extends Person {
    public void tampilkanInfoIbu() {
        System.out.println("Nama Ibu: " + nama);
        System.out.println("Umur Ibu: " + umur);
        System.out.println("Alamat: " + kota + ", " + negara);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }

    public void sapaIbu() {
        System.out.println("Halo, " + nama + "! Selamat datang di Posyandu!");
    }
}
