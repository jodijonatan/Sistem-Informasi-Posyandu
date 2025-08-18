package main;

public class JadwalPosyandu {
    public String namaKegiatan;
    public String tanggalPelaksanaan;
    public String waktuMulai;
    public String waktuSelesai;
    public String namaLokasi;

    public void tampilkanJadwal () {
        System.out.println("Nama Kegiatan: " + namaKegiatan);
        System.out.println("Tanggal Pelaksanaan: " + tanggalPelaksanaan);
        System.out.println("Waktu Mulai: " + waktuMulai);
        System.out.println("Waktu Selesai: " + waktuSelesai);
        System.out.println("Nama Lokasi: " + namaLokasi);
    }

    public void setInfoJadwal(String nama, String tanggal, String waktuMulai, String waktuSelesai, String namaLokasi) {
        this.namaKegiatan = nama;
        this.tanggalPelaksanaan = tanggal;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.namaLokasi = namaLokasi;
        // System.out.println("Informasi jadwal berhasil disimpan.");
    }

    public void tampilkanWaktuMulai() {
        System.out.println("Waktu mulai kegiatan: " + this.waktuMulai);
    }

    public void cekStatusJadwal() {
        if (this.namaKegiatan != null && !this.namaKegiatan.isEmpty()) {
            System.out.println("Jadwal sudah terisi untuk kegiatan: " + this.namaKegiatan);
        } else {
            System.out.println("Jadwal belum terisi.");
        }
    }
}
