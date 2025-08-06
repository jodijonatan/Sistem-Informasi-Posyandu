package utama;

public class DataKesehatan {
    public double beratBadan;
    public double tinggiBadan;
    public int tekananDarahSistolik;
    public int tekananDarahDiastolik;
    public int detakJantung; 
    public double suhuTubuh;   

    public void tampilanDataKesehatan () {
        System.out.println("Berat Badan: " + beratBadan);
        System.out.println("Tinggi Badan: " + tinggiBadan);
        System.out.println("Tekanan Darah Sistolik: " + tekananDarahSistolik);
        System.out.println("Tekanan Darah Diastolik: " + tekananDarahDiastolik);
        System.out.println("Detak Jantung: " + detakJantung);
        System.out.println("Suhu Tubuh: " + suhuTubuh);
    }
}
