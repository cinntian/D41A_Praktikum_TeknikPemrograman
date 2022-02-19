package berhitung;

/**
 * This program is to calculate using arithmetic operators
 * @author Cintia
 * @version 1.0
 * @Date 19-02-2022
 */
import java.util.Scanner;
public class Berhitung {

    public static void main(String[] args){
        //deklarasi variabel
        int hasil;
        
        Scanner keyboard  = new Scanner(System.in);
        
        System.out.print("Masukkan angka ke-1 operator dan angka ke-2 : \n");
        int angka1 = keyboard.nextInt();
        char operator = keyboard.next().charAt(0);
        int angka2 = keyboard.nextInt();
        
        if(angka1 >= 1 & angka1 <= 1000 && angka2 >= 1 & angka2<=1000){
            switch (operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println(hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(hasil);
                break;
            case '%':
                hasil = angka1 % angka2;
                System.out.println(hasil);
                break;
            }
        }
    }
}