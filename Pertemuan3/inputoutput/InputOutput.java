package inputoutput;

/**
 * This program is to split the string into tokens and count the number of tokens
 * @author Cintia
 * @version 1.0
 * @Date 18-02-2022
 */
import java.util.Scanner;
public class InputOutput {

    public static void main(String[] args) {
        //deklarasi variabel
        String s;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan String : ");
        s = keyboard.nextLine();

        String[] tokens = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+")); //bagi menjadi beberapa token
            System.out.println(tokens.length);  //menghitung banyak token
            for (String string : tokens) {
                System.out.println(string);
              }
    }
}