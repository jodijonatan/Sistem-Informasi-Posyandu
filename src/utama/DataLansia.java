package utama;

class DataLansia extends DataKesehatan {
    public double kadarKolesterol;
    public double kadarGulaDarah;

    public void tampilanKadarKolesterol() {
        tampilanDataKesehatan();
        System.out.println("Kadar Kolesterol: " + kadarKolesterol);
    }

    public void tampilkanKadarGulaDarah () {
        tampilanDataKesehatan();
        System.out.println("Kadar Gula Darah: " + kadarGulaDarah);
    }
}
