package main;

public class Anak extends Person {
    public void tampilkanInfoAnak() {
        System.out.println("Nama Anak: " + nama);
        System.out.println("Umur Anak: " + umur);
        System.out.println("Alamat: " + kota + ", " + negara);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }
}
