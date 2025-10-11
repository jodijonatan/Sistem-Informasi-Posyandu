package utama;

class DataAnak extends DataKesehatan {
    public double lingkarKepala;
    public double lingkarLenganAtas;

    public void tampilanLingkarKepala() {
        tampilanDataKesehatan(); 
        System.out.println("Lingkar Kepala: " + lingkarKepala);
    }

    public void tampilanLingkarLenganAtas () {
        tampilanDataKesehatan();
        System.out.println("Lingkar Lengan Atas: " + lingkarLenganAtas);
    }
}