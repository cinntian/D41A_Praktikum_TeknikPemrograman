package dependence;

/**
 * @author Cintia
 * @since 20/03/2022
 */

public class Dependence {
    public static void main(String[] args) {
        InfoP inproduk = new InfoP();
        NProduk naproduk = new NProduk();
        
        System.out.println("\t Produk");
        System.out.println("========================");
        inproduk.print(naproduk);
    }
    
}
