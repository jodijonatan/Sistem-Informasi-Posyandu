package utama;

public class Main {
    public static void main(String[] args) {
        Anak Diego = new Anak();
        Diego.nama = "Diego";
        Diego.umur = 16;
        Diego.tanggalLahir = "01-01-2020";
        Diego.kota = "Medan";
        Diego.negara = "Indonesia";
        Diego.tampilkanInfoAnak();

        System.out.println("\n");

        Ibu Wati = new Ibu();
        Wati.nama = "Wati";
        Wati.umur = 40;
        Wati.tanggalLahir = "01-01-1983";
        Wati.kota = "Medan";
        Wati.negara = "Indonesia";
        Wati.tampilkanInfoIbu();
        
        System.out.println("\n");

        PetugasPosyandu Andre = new PetugasPosyandu();
        Andre.nama = "Andre";
        Andre.umur = 30;
        Andre.tanggalLahir = "01-01-1993";
        Andre.kota = "Medan";
        Andre.negara = "Indonesia";
        Andre.tampilkanInfoPetugas();
    }
}