package main;

class DataAnak extends DataKesehatan {
    public double lingkarKepala;
    public double lingkarLenganAtas;

    public void tampilanDataAnak() {
        tampilanDataKesehatan(); 
        System.out.println("Lingkar Kepala: " + lingkarKepala);
        System.out.println("Lingkar Lengan Atas: " + lingkarLenganAtas);
    }
}