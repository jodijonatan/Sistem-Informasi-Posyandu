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
}
