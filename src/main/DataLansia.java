package main;

class DataLansia extends DataKesehatan {
    public double kadarGulaDarah;
    public double kadarKolesterol;

    public void tampilanDataLansia() {
        tampilanDataKesehatan();
        System.out.println("Kadar Gula Darah: " + kadarGulaDarah);
        System.out.println("Kadar Kolesterol: " + kadarKolesterol);
    }
}
