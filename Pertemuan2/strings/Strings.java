/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

/**
 * @author Cintia Ningsih
 * @version 1.0
 * @Date 12-02-2022
 */

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        // deklarasi variabel
        String A, B;
        int jmlKar;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan String A : ");
        A = keyboard.nextLine();
        System.out.print("Masukkan String B : ");
        B = keyboard.nextLine();
        
        jmlKar = A.length()+B.length();
        System.out.println("\n"+ jmlKar);
        
        if (A.compareToIgnoreCase(B) >= 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A + " " +B);
     
    }

}