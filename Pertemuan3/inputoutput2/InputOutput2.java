package inputoutput2;

/**
 * This program is to output a left aligned String using exactly 15 characters. 
 * and displays a 3-digit integer, if the original input has less than 3 digits,
 * the leading digit of the output is zero.
 * @author Cintia
 * @version 1.0
 * @Date 18-02-2022
 */
import java.util.Scanner;
public class InputOutput2 {

    public static void main(String[] args) {
        
        Scanner keyboard  = new Scanner(System.in);
        
        System.out.printf("masukan string 1 : ");
        String kata1 = keyboard.next();
        int A1 = keyboard.nextInt();
        
        System.out.printf("masukan string 2 : ");
        String kata2 = keyboard.next();
        int A2 = keyboard.nextInt();
        
        System.out.printf("masukan string 3 : ");
        String kata3 = keyboard.next();
        int A3 = keyboard.nextInt();
        
        System.out.println("================================");
        System.out.printf( "%-15s%03d %n", kata1, A1);
        System.out.printf( "%-15s%03d %n", kata2, A2);
        System.out.printf( "%-15s%03d %n", kata3, A3);
        System.out.println("================================");
        
    }
}