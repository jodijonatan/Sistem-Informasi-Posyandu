package utama;

class Bidan extends PetugasPosyandu {
    private String nomorLisensi;

    public void setNomorLisensi(String nomor) {
        this.nomorLisensi = nomor;
    }
    
    public void periksaIbuHamil(IbuHamil ibu) {
        System.out.println(this.nama + ", seorang Bidan dengan nomor lisensi " + this.nomorLisensi + ", melakukan pemeriksaan terhadap Ibu " + ibu.nama + ".");
    }

    public static void main(String[] args) {
        Bidan Diana = new Bidan();
        Diana.nama = "Diana";
        Diana.umur = 35;
        Diana.tanggalLahir = "01-01-1988";
        Diana.kota = "Medan";
        Diana.negara = "Indonesia";
        Diana.setNomorLisensi("BIDAN123");
        Diana.tampilkanInfoPetugas();
        Diana.sapaPetugas();
    }
}