package main;

public class IbuBekerja extends Ibu {
  public String pekerjaan;

  public void sapaIbuBekerja () {
    System.out.println("Hai, saya ibu bekerja");
  }

  public void namaPekerjaan () {
    System.out.println("Hai, nama saya " + this.nama + "saya bekerja sebagai " + this.pekerjaan);
  }
}
