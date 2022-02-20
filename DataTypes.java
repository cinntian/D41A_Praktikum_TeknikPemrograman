/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatypes;

/**
 * This program is to check whether the input from the keyboard is entered into the byte, short, int, long data type or not
 * @author Cintia Ningsih
 * @version 1.0
 * @Date 11-02-2022
 */
import java.util.Scanner;

class DataTypes {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
    double angka;
 
    System.out.print("input numbers : ");
    angka = input.nextDouble();
    
    if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE){
        System.out.println((long)angka + " can be fitted in:\n" + "* byte\n" + "* short\n" + "* int\n" + "* long");
    } else if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE){
        System.out.println((long)angka + " can be fitted in:\n" + "* short\n" + "* int\n" + "* long" );
    } else if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE){
        System.out.println((long)angka + " can be fitted in:\n" + "* int\n" + "* long");
    } else if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
        System.out.println((long)angka + " can be fitted in:\n" + "* long");
    } else{
        System.out.println((long)angka + " can’t be fitted anywhere");  
    } 
  }
}
