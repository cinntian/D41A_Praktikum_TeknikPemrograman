package bignumber;

/**
 * This program is to add and multiply large numbers
 * @author Cintia
 * @version 1.0
 * @Date 19-02-2022
 */

import java.util.Scanner;
import java.math.*;

public class  BigNumber{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("masukkan bilangan a : ");
        BigInteger bilA = new BigInteger(scan.next());
        System.out.print("masukkan bilangan b : ");
        BigInteger bilB = new BigInteger(scan.next());
        
        System.out.println("\n" + bilA.add(bilB));           //Penjumalahan bilangan a dan b
        System.out.println(bilA.multiply(bilB));      //perkalian bilangan a dan b
    }
}
