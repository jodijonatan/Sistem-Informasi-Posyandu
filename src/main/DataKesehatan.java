package main;

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

    public String berat_sehat() {
        if (beratBadan < 18.5) {
            return "Status: Kurang Berat Badan";
        } else if (beratBadan >= 18.5 && beratBadan < 24.9) {
            return "Status: Normal";
        } else {
            return "Status: Kelebihan Berat Badan";
        }
    }

    public String tinggi_sehat () {
        if (tinggiBadan < 150) {
            return "Status: Pendek";
        } else if (tinggiBadan >= 150 && tinggiBadan <= 180) {
            return "Status: Normal";
        } else {
            return "Status: Tinggi";
        }
    }

    public String tekanan_darah_sehat() {
        if (tekananDarahSistolik < 90 || tekananDarahDiastolik < 60) {
            return "Status: Tekanan Darah Rendah";
        } else if ((tekananDarahSistolik >= 90 && tekananDarahSistolik <= 120) && 
                   (tekananDarahDiastolik >= 60 && tekananDarahDiastolik <= 80)) {
            return "Status: Normal";
        } else {
            return "Status: Tekanan Darah Tinggi";
        }
    }

    public String detak_jantung_sehat() {
        if (detakJantung < 60) {
            return "Status: Detak Jantung Rendah";
        } else if (detakJantung >= 60 && detakJantung <= 100) {
            return "Status: Normal";
        } else {
            return "Status: Detak Jantung Tinggi";
        }
    }

    public String suhuTubuh_sehat() {
        if (suhuTubuh < 36.1) {
            return "Status: Suhu Tubuh Rendah";
        } else if (suhuTubuh >= 36.1 && suhuTubuh <= 37.2) {
            return "Status: Normal";
        } else {
            return "Status: Suhu Tubuh Tinggi";
        }
    }

    public void is_sehat () {
        if (berat_sehat().equals("Status: Normal") &&
            tinggi_sehat().equals("Status: Normal") &&
            tekanan_darah_sehat().equals("Status: Normal") &&
            detak_jantung_sehat().equals("Status: Normal") &&
            suhuTubuh_sehat().equals("Status: Normal")) {
            System.out.println("Kondisi: Sehat");
        } else {
            System.out.println("Kondisi: Sakit");
        }
    }
}
