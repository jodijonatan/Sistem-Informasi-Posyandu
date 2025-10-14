package utama;

public class seltahanan {
    //Atribut
    public int identitasidSel;
    public String datakapasitas;
    public int datajumlahPenghuni;
    public String informasijenisSel;
    
    //method 1
    int idselTahanan(int idSel){
        System.out.println("Id Sel tahanan :"+idSel);
        int identitasidSel= idSel;
        return identitasidSel ;
    }
    //method 2
    String kapasitasselTahanan(String kapasitas){
        System.out.println("Kapasitas Sel tahanan :"+kapasitas);
        String dataKapasitas= kapasitas;
        return dataKapasitas ;
    }
    //method 3
    int jumlahpenghuniselTahanan(int jumlahPenghuni){
        System.out.println("Jumlah Penghuni Sel tahanan:"+jumlahPenghuni);
        int datajumlahPenghuni= jumlahPenghuni;
        return datajumlahPenghuni ;
    }
     //method 4
    String jenisselTahanan(String jenisSel){
        System.out.println("Jenis Sel tahanan :"+jenisSel);
        String informasijenisSel= jenisSel;
        return informasijenisSel;
    }
    //method 5
    void tampilkanDataSelTahanan() {
        System.out.println("=== Data Sel Tahanan ===");
        System.out.println("ID Sel           : " + identitasidSel);
        System.out.println("Kapasitas        : " + datakapasitas);
        System.out.println("Jumlah Penghuni  : " + datajumlahPenghuni);
        System.out.println("Jenis Sel        : " + informasijenisSel);
        System.out.println("=========================");
    }
    public static void main(String[] args) {
      seltahanan sel1 = new seltahanan();
        sel1.identitasidSel(29092);
        sel1.kapasitasselTahanan("1000orangditampung");
        sel1.jumlahpenghuniselTahanan(450);
        sel1.jenisselTahanan("Besi Anti Bobol");

        sel1.tampilkanDataSelTahanan();

    }
}


