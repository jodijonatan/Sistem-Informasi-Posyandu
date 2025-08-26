package main;

public class Main {
    public static void main(String[] args) {
        Anak Diego = new Anak();
        Diego.nama = "Diego";
        Diego.umur = 16;
        Diego.tanggalLahir = "01-01-2020";
        Diego.kota = "Medan";
        Diego.negara = "Indonesia";
        Diego.tampilkanInfoAnak();
        Diego.sapaAnak();

        System.out.println("\n");

        Balita Nethan = new Balita();
        Nethan.nama = "Nethan";
        Nethan.umur = 4;
        Nethan.tanggalLahir = "01-01-2019";
        Nethan.kota = "Medan";
        Nethan.negara = "Indonesia";
        Nethan.setBeratTinggi(12.5, 85.0);
        Nethan.tampilkanInfoBalita();

        System.out.println("\n");

        DataKesehatan KesehatanDiego = new DataKesehatan();
        KesehatanDiego.beratBadan = 54.2;
        KesehatanDiego.tinggiBadan = 169.0;
        KesehatanDiego.tekananDarahSistolik = 6;
        KesehatanDiego.tekananDarahDiastolik = 9;
        KesehatanDiego.detakJantung = 999;
        KesehatanDiego.suhuTubuh = 40.9;
        KesehatanDiego.tampilanDataKesehatan();
        KesehatanDiego.berat_sehat();
        KesehatanDiego.tinggi_sehat();
        KesehatanDiego.tekanan_darah_sehat();
        KesehatanDiego.detak_jantung_sehat();
        KesehatanDiego.suhuTubuh_sehat();
        KesehatanDiego.is_sehat();
        
        System.out.println("\n");

        Diego.setKesehatan(KesehatanDiego);
        
        DataKesehatan dataHasil = Diego.getKesehatan();

        System.out.println("Berat Badan " + Diego.nama + ": " + dataHasil.beratBadan + " kg");
        System.out.println("Tinggi Badan " + Diego.nama + ": " + dataHasil.tinggiBadan + " cm");

        System.out.println("\n");

        Ibu Wati = new Ibu();
        Wati.nama = "Wati";
        Wati.umur = 40;
        Wati.tanggalLahir = "01-01-1983";
        Wati.kota = "Medan";
        Wati.negara = "Indonesia";
        Wati.tampilkanInfoIbu();
        Wati.sapaIbu();
        
        System.out.println("\n");

        IbuHamil Sari = new IbuHamil();
        Sari.nama = "Sari";
        Sari.umur = 28;
        Sari.tanggalLahir = "01-01-1995";
        Sari.kota = "Medan";
        Sari.negara = "Indonesia";
        Sari.setUsiaKehamilan(5);
        Sari.tampilkanInfoIbuHamil();

        System.out.println("\n");

        Wati.setAnak(Diego);
        Wati.tampilkanInfoAnak();

        System.out.println("\n");
        
        PetugasPosyandu Andre = new PetugasPosyandu();
        Andre.nama = "Andre";
        Andre.umur = 30;
        Andre.tanggalLahir = "01-01-1993";
        Andre.kota = "Medan";
        Andre.negara = "Indonesia";
        Andre.tampilkanInfoPetugas();
        Andre.sapaPetugas();

        Andre.catatDataAnak(Diego, KesehatanDiego);
        
        System.out.println("\n");

        Bidan Diana = new Bidan();
        Diana.nama = "Diana";
        Diana.umur = 35;
        Diana.tanggalLahir = "01-01-1988";
        Diana.kota = "Medan";
        Diana.negara = "Indonesia";
        Diana.setNomorLisensi("BIDAN123");
        Diana.tampilkanInfoPetugas();
        Diana.sapaPetugas();

        System.out.println("\n");

        JadwalPosyandu JadwalDiego = new JadwalPosyandu();
        JadwalDiego.setInfoJadwal("Operasi Otak", "20 Agustus 2026", "08:00", "10:00", "Rumah Ibu Wati");
        JadwalDiego.tampilkanJadwal();

        System.out.println("\n");

        JadwalDiego.tampilkanWaktuMulai();
        JadwalDiego.cekStatusJadwal();

        System.out.println("\n");

        Andre.berikanInformasiJadwal(JadwalDiego);
    }
}