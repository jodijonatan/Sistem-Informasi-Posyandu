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

    public void catatDataAnak(Anak anak, DataKesehatan data) {
        anak.setKesehatan(data);
        System.out.println(this.nama + " berhasil mencatat data kesehatan untuk anak bernama " + anak.nama + ".");
    }

    public void berikanInformasiJadwal(JadwalPosyandu jadwal) {
        System.out.println(this.nama + " memberikan informasi jadwal:");
        jadwal.tampilkanJadwal();
    }
}

class Bidan extends PetugasPosyandu {
    private String nomorLisensi;

    public void setNomorLisensi(String nomor) {
        this.nomorLisensi = nomor;
    }

    public void periksaIbuHamil(IbuHamil ibu) {
        System.out.println(this.nama + ", seorang Bidan dengan nomor lisensi " + this.nomorLisensi + ", melakukan pemeriksaan terhadap Ibu " + ibu.nama + ".");
    }
}