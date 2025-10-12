package utama;

class IbuHamil extends Ibu {
    private int usiaKehamilan;

    public void setUsiaKehamilan(int bulan) {
        this.usiaKehamilan = bulan;
    }

    public void tampilkanInfoIbuHamil() {
        tampilkanInfoIbu();
        System.out.println("Usia Kehamilan: " + this.usiaKehamilan + " bulan");
    }

    public static void main(String[] args) {
        IbuHamil Sari = new IbuHamil();
        Sari.nama = "Sari";
        Sari.umur = 28;
        Sari.tanggalLahir = "01-01-1995";
        Sari.kota = "Medan";
        Sari.negara = "Indonesia";
        Sari.setUsiaKehamilan(5);
        Sari.tampilkanInfoIbuHamil();
    }
}
