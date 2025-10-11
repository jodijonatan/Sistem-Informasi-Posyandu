package utama;
import java.util.Scanner;

public class Admin extends PetugasPosyandu {
    Scanner input = new Scanner(System.in);
    public String username;
    public Anak client;

    public void sapaAdmin () {
      System.out.println("Masukkan username admin: ");
      username = input.nextLine();
      System.out.println("Hai, admin " + username + "!");
    }

    public void sapaClient () {
      client = new Anak();
      client.nama = "Diego";
      System.out.println("Hai, senang bertemu dengan mu " + client.nama + "!");
    }
}
