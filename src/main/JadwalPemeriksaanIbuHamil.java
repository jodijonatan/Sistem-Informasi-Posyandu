package main;

class JadwalPemeriksaanIbuHamil extends JadwalPosyandu {
    public String namaBidan;
    public String jenisPemeriksaan;

    public void setInfoPemeriksaan(String namaBidan, String jenisPemeriksaan) {
        this.namaBidan = namaBidan;
        this.jenisPemeriksaan = jenisPemeriksaan;
    }

    public void tampilkanJadwalPemeriksaan() {
        tampilkanJadwal();
        System.out.println("Bidan yang bertugas: " + namaBidan);
        System.out.println("Jenis Pemeriksaan: " + jenisPemeriksaan);
    }
}
