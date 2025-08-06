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
}
