package main;

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
}
