package Kasus2;

/**
 * @modification cintia
 */

import java.util.Scanner;

public class Restaurant {
    
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;

    public String[] getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String[] nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public double[] getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(double[] harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int[] getStok() {
        return stok;
    }

    public void setStok(int[] stok) {
        this.stok = stok;
    }

    public static byte getId() {
        return id;
    }

    public static void setId(byte id) {
        Restaurant.id = id;
    }
    
    //kamus data
    int i;
    int pilihanMakanan, jumlahMakanan, penguranganStok, kurangStok;
    char respon;
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan(){
        for(i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
    
    public void menuUtama(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=================================================");
        System.out.println("\t\t  RESTAURANT");
        System.out.println("=================================================");
        System.out.println("\t\tMENU MAKANAN");
        System.out.println("\t1. Bala-Bala");
        System.out.println("\t2. Gehu");
        System.out.println("\t3. Tahu");
        System.out.println("\t4. Molen");
        
        System.out.println("*************************************************");
        System.out.println("\t\t  PESANAN");
        System.out.println("*************************************************");
        System.out.print("Input pilihan menu makanan (1/2/3/4) : ");
        pilihanMakanan = keyboard.nextInt();
        System.out.print("Input penambahan jumlah makanan      : ");
        jumlahMakanan = keyboard.nextInt();
        System.out.println("*************************************************");
        
        switch (pilihanMakanan) {
            case 1: System.out.println("Makanan yang dipesan : Bala-Bala dengan jumlah " + jumlahMakanan);
                    
                break;
            case 2: System.out.println("Makanan yang dipesan : Gehu dengan jumlah " + jumlahMakanan);
                    
                break;
            case 3: System.out.println("Makanan yang dipesan : Tahu dengan jumlah " + jumlahMakanan);
                    
                break;
            case 4: System.out.println("Makanan yang dipesan : Molen dengan jumlah " + jumlahMakanan);
                    
                break;
            default:
                break;
        }
       System.out.println("=================================================");
       System.out.println("");
    }    
    
    public void penguranganStok(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=================================================");
        System.out.print("\t\tPENGURANGAN STOK\n");
        System.out.println("*************************************************");
        System.out.print("Apakan ingin mengurangi stok? (y/t) : ");
        respon = keyboard.next().charAt(0);
        
        if(respon == 'y' | respon == 'Y'){
            System.out.print("Input pilihan menu makanan yang ingin dikurangi       : ");
            kurangStok = keyboard.nextInt();
            System.out.print("Input jumlah pengurangan stok dari makanan yg dipilih : ");
            penguranganStok = keyboard.nextInt();
            System.out.println("*************************************************");
            
            switch (kurangStok) {
            case 1: System.out.println("Makanan yang dikuarngi Bala-Bala dengan jumlah " + penguranganStok);
                    kurangStok();
                break;
            case 2: System.out.println("Makanan yang dikurangi Gehu dengan jumlah " + penguranganStok);
                    i=i+1;
                    kurangStok();
                break;
            case 3: System.out.println("Makanan yang dikurangi Tahu dengan jumlah " + penguranganStok);
                    i=i+2;
                    kurangStok();
                break;
            case 4: System.out.println("Makanan yang dikurangi Molen dengan jumlah " + penguranganStok);
                    i=i+3;
                    kurangStok();
                break;
            default:
                break;
            }
        }
        System.out.println("=================================================");  
        System.out.println("");
    }
    
    public void kurangStok(){
        if(!isOutOfStock(i)){
            this.stok[i] -= penguranganStok;
        }else{
            System.out.println("TIDAK DAPAT DIKURANGI KARENA STOK HABIS");
        }
    }
}