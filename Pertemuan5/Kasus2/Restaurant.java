package Kasus2;

/**
 * @modification cintia
 */

import java.util.Scanner;

public class Restaurant extends foodOrder{
    
    private foodOrder[] menu;
    public static byte id=1;
    
    //kamus data
    int i;
    int pilihanMakanan, jumlahMakanan, stokKurang, menuStok;
    char respon;
    
    public Restaurant() {
        menu = new foodOrder[10];
        for(i=0 ; i<10 ; i++){
            menu[i] = new foodOrder();
        }
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        menu[id].setNama_makanan(nama);
        menu[id].setHarga_makanan(harga);
        menu[id].setStok(stok);
    }
    
    public void tampilMenuMakanan(){
        for(i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(menu[i].getNama_makanan() +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(menu[id].getStok() == 0){
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
            menuStok = keyboard.nextInt();
            System.out.print("Input jumlah pengurangan stok dari makanan yg dipilih : ");
            stokKurang = keyboard.nextInt();
            System.out.println("*************************************************");
            
            switch (menuStok) {
            case 1: System.out.println("Makanan yang dikuarngi Bala-Bala dengan jumlah " + stokKurang);
                    kurangStok(menuStok,stokKurang);
                break;
            case 2: System.out.println("Makanan yang dikurangi Gehu dengan jumlah " + stokKurang);
                    kurangStok(menuStok, stokKurang);
                break;
            case 3: System.out.println("Makanan yang dikurangi Tahu dengan jumlah " + stokKurang);
                    i=i+2;
                    kurangStok(menuStok, stokKurang);
                break;
            case 4: System.out.println("Makanan yang dikurangi Molen dengan jumlah " + stokKurang);
                    i=i+3;
                    kurangStok(menuStok, stokKurang);
                break;
            default:
                break;
            }
        }
        System.out.println("=================================================");  
        System.out.println("");
    }
    
    public void kurangStok(int id, int stokKurang){
        if(!isOutOfStock(id)){
            int stok = this.menu[id].getStok() - stokKurang;
            menu[id].setStok(stok);
        }else{
            System.out.println("TIDAK DAPAT DIKURANGI KARENA STOK KOSONG");
        }
    }
}