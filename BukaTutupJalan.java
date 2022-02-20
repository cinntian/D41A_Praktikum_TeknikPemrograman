package bukatutupjalan;

/**
 * This program is a road closure rule
 * @author Cintia
 * @version 1.0
 * @Date 19-02-2022
 */
import java.util.Scanner;

public class  BukaTutupJalan{
 public static void main (String args[]) {
    //Deklarasi variabel
    int plat1, plat2, plat3, plat4;
    String mobil1, mobil2, mobil3, mobil4, gabungan;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Masukkan plat nomer : ");
    plat1 = keyboard.nextInt();
    plat2 = keyboard.nextInt();
    plat3 = keyboard.nextInt();
    plat4 = keyboard.nextInt();
    
    mobil1 = String.valueOf(plat1);
    mobil2 = String.valueOf(plat2);
    mobil3 = String.valueOf(plat3);
    mobil4 = String.valueOf(plat4);
    
    gabungan = mobil1 + mobil2 + mobil3 + mobil4;
    
    Long a = Long.valueOf(gabungan);
    Long result = (a-999999)%5;
    
    if (result == 0){
        System.out.print("jalan\n");
    }else{
        System.out.print("berhenti\n");
    }
  }
}