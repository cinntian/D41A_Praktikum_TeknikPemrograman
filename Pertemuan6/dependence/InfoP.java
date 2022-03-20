package dependence;

/**
 * @author Cintia
 * @since 20/03/2022
 */

public class InfoP {
    void print(NProduk produk){
        produk.setNamaProduk("Wardah");
        produk.setKode("222 555");
        
        System.out.println("Nama produk : " + produk.getNamaProduk());
        System.out.println("Kode Produk : " + produk.getKode());
    }   
}
