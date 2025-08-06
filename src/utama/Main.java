package utama;

public class Main {
    public static void main(String[] args) {
        Anak Diego = new Anak();
        Diego.nama = "Diego";
        Diego.umur = 16;
        Diego.tanggalLahir = "01-01-2020";
        Diego.kota = "Medan";
        Diego.negara = "Indonesia";
        Diego.tampilkanInfoAnak();

        System.out.println("\n");

        DataKesehatan KesehatanDiego = new DataKesehatan();
        KesehatanDiego.beratBadan = 54.2;
        KesehatanDiego.tinggiBadan = 169.0;
        KesehatanDiego.tekananDarahSistolik = 6;
        KesehatanDiego.tekananDarahDiastolik = 9;
        KesehatanDiego.detakJantung = 999;
        KesehatanDiego.suhuTubuh = 40.9;
        KesehatanDiego.tampilanDataKesehatan();

        System.out.println("\n");

        Ibu Wati = new Ibu();
        Wati.nama = "Wati";
        Wati.umur = 40;
        Wati.tanggalLahir = "01-01-1983";
        Wati.kota = "Medan";
        Wati.negara = "Indonesia";
        Wati.tampilkanInfoIbu();
        
        System.out.println("\n");
        
        PetugasPosyandu Andre = new PetugasPosyandu();
        Andre.nama = "Andre";
        Andre.umur = 30;
        Andre.tanggalLahir = "01-01-1993";
        Andre.kota = "Medan";
        Andre.negara = "Indonesia";
        Andre.tampilkanInfoPetugas();
        
        System.out.println("\n");

        JadwalPosyandu JadwalDiego = new JadwalPosyandu();
        JadwalDiego.namaKegiatan = "Operasi Otak";
        JadwalDiego.tanggalPelaksanaan = "20 Agustus 2026";
        JadwalDiego.waktuMulai = "08:00";
        JadwalDiego.waktuSelesai = "10:00";
        JadwalDiego.namaLokasi = "Rumah Ibu Wati";
        JadwalDiego.tampilkanJadwal();
    }
}