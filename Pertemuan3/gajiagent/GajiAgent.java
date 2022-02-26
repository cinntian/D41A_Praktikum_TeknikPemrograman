package gajiagent;

/**
 * This program is to calculate agent salary
 * @author Cintia
 * @version 1.0
 * @Date 19-02-2022
 */
import java.util.Scanner;
public class GajiAgent {

    public static void main(String[] args) {
        // deklarsi variabel
        double gajiPokok = 500000, satuanItem = 50000;
        double totalGaji, bonus, denda, jumlahDenda;
        
        Scanner keyboard  = new Scanner(System.in);
        
        System.out.print("Banyak item yang terjual : ");
        int item = keyboard.nextInt();
        
        if(40 <= item && item <= 80){
            bonus = (gajiPokok * 25)/100;
            totalGaji = gajiPokok + bonus;
            System.out.println((int)totalGaji);
        }
        else if(item > 80){
            bonus = (gajiPokok * 35)/100;
            totalGaji = gajiPokok + bonus;
            System.out.println((int)totalGaji);
        }
        else if(item < 15){
            denda = (15 - item)*satuanItem;
            jumlahDenda = (denda*15)/100;
            totalGaji = gajiPokok - jumlahDenda;
            System.out.println((int)totalGaji);
        }else {
            bonus = ((satuanItem * item)*10)/100;
            totalGaji = gajiPokok + bonus;
            System.out.println((int)totalGaji);
        }
        
    }
}