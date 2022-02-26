package Kasus1_barang;

/**
 * @modification Cintia
 * @since 25-02-2022
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public int getStok(){
        return this.stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    
    void addStok(int tambah){   //modul procedure untuk operasi aritmatika yaitu penjumlahan
        stok += tambah;         //paramater tambah merupakan parameter yang bertipe integer untuk menampung besar pertambahan yang dilakukan
    }
    
    public Barang (String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
}
