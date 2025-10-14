package utama;

public class tahanan {
    //Atribut
    public String informasiKasus;
    public int datatanggalMasuk;
    public int datalamaHukuman;
    public String datablokSel;

    //method 1
    String kasusTahanan(String kasus){
        System.out.println("Kasus tahanan :"+kasus);
        String informasiKasus= kasus;
        return informasiKasus ;
    }
    //method 2
    int tanggalmasukTahanan(int tanggalMasuk){
        System.out.println("Tanggal Masuk tahanan:"+tanggalMasuk);
        int datatanggalMasuk= tanggalMasuk;
        return datatanggalMasuk ;
    }
    //method 3
    int lamaHukumanTahanan(int lamaHukuman){
        System.out.println("Lama Hukuman tahanan:"+lamaHukuman);
        int datalamaHukuman= lamaHukuman;
        return datalamaHukuman ;
    }    
    //method 4
    String blokselTahanan(String blokSel){
        System.out.println("Blok Sel tahanan :"+blokSel);
        String datablokSel= blokSel;
        return datablokSel;
    }    
    //method 5
    void tampilkanDataTahanan() {
        System.out.println("=== Data Tahanan ===");
        System.out.println("Kasus           : " + informasiKasus);
        System.out.println("Tanggal Masuk  : " + datatanggalMasuk);
        System.out.println("Lama Hukuman    : " + datalamaHukuman);
        System.out.println("Blok Sel        : " + datablokSel);
        System.out.println("=====================");
    }
    public static void main(String[] args) {
       tahanan tahanan1 = new tahanan();
        tahanan1.kasusTahanan("Korup uang jula jula");
        tahanan1.tanggalmasukTahanan("12-8-2054");
        tahanan1.lamaHukumanTahanan("20tahun+300jt");
        tahanan1.blokselTahanan("keamananketat");

        tahanan11.tampilkanDataTahanan(); 
    }
}
