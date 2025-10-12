package utama;

class Balita extends Anak {
    private double beratBadan;
    private double tinggiBadan;

    public void setBeratTinggi(double berat, double tinggi) {
        this.beratBadan = berat;
        this.tinggiBadan = tinggi;
    }

    public void tampilkanInfoBalita() {
        System.out.println("--- Informasi Balita ---");
        // tampilkanInfoAnak();
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
    }

    public static void main(String[] args) {
        Balita Nethan = new Balita();
        Nethan.nama = "Nethan";
        Nethan.umur = 4;
        Nethan.tanggalLahir = "01-01-2019";
        Nethan.kota = "Medan";
        Nethan.negara = "Indonesia";
        Nethan.setBeratTinggi(12.5, 85.0);
        Nethan.tampilkanInfoBalita();
    }
}
