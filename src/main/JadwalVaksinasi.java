package main;

class JadwalVaksinasi extends JadwalPosyandu {
    public String jenisVaksin;
    public String sasaranUsia;

    public void setInfoVaksin(String jenisVaksin, String sasaranUsia) {
        this.jenisVaksin = jenisVaksin;
        this.sasaranUsia = sasaranUsia;
    }
    
    public void tampilkanJadwalVaksinasi() {
        tampilkanJadwal();
        System.out.println("Jenis Vaksin: " + jenisVaksin);
        System.out.println("Sasaran Usia: " + sasaranUsia);
    }
}