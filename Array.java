package array;

/**
 * This program is to display array
 * @author Cintia
 * @version 1.0
 * @Date 19-02-2022
 */

public class  Array{
 public static void main (String args[]) {
    //Deklarasi variabel
    int x,y;
    //One Dimensional Arrays
    int[] fisrtArray = {2, 5, 3}; 
    int[] secondArray = {9, 5, 3}; 
    int[] thirdArray = {2, 4, 9}; 
    int[] fourthArray = {10, 11, 12}; 
    int[] fifthArray = {13, 14, 15}; 
    int[] sixthArray = {16, 17, 18}; 
    int[] seventhArray = {19, 20, 21}; 
    int[] eighthArray = {22, 23, 24}; 
    int[] ninthArray = {25, 26, 27}; 
    //Two Dimensional Arrays
    int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
    int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
    int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
    //Three Dimensional Array
    int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
    
    //Menampilkan isi array
    System.out.print("{");
       for (x=0; x<3; x++){
           System.out.print("{");
           for (y=0 ; y<3; y++){
               System.out.print(twoDimensionalArray1[x][y]+ " ");
           }
           System.out.print("}" +" ");
       }
    System.out.print("}" +"\n");
    
    System.out.print("{");
       for (x=0; x<3; x++){
           System.out.print("{");
           for (y=0 ; y<3; y++){
               System.out.print(twoDimensionalArray2[x][y]+ " ");
           }
           System.out.print("}" +" ");
       }
    System.out.print("}"+"\n");
    
    System.out.print("{");
       for (x=0; x<3; x++){
           System.out.print("{");
           for (y=0 ; y<3; y++){
               System.out.print(twoDimensionalArray3[x][y]+ " ");
           }
           System.out.print("}" +" ");
       }
    System.out.print("}" +"\n");
    }
}
 
