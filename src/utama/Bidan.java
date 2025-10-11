package utama;

class Bidan extends PetugasPosyandu {
    private String nomorLisensi;

    public void setNomorLisensi(String nomor) {
        this.nomorLisensi = nomor;
    }
    
    public void periksaIbuHamil(IbuHamil ibu) {
        System.out.println(this.nama + ", seorang Bidan dengan nomor lisensi " + this.nomorLisensi + ", melakukan pemeriksaan terhadap Ibu " + ibu.nama + ".");
    }
}