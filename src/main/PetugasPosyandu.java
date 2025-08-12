package main;

public class PetugasPosyandu extends Person {
    public void tampilkanInfoPetugas() {
        System.out.println("Nama Petugas: " + nama);
        System.out.println("Umur Petugas: " + umur);
        System.out.println("Alamat: " + kota + ", " + negara);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }

    public void sapaPetugas() {
        System.out.println("Halo, " + nama + "! Selamat datang di Posyandu!");
    }
}
