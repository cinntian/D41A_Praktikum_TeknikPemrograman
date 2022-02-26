package Kasus2_upinipin;

/**
 * @modification Cintia
 * @since 25-02-2022
 */

public class Item {
    private String name;
    private Item()
    {
        name = "Ipin";
    }
    
    public Item(String name) {
        this.name = new Item().name;    //pengisian agar output yang di hasilkan adalah Ipin
        System.out.println(this.name);
    }
}
