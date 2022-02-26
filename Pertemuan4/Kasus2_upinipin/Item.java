package Kasus2_upinipin;

/**
 * @modif Cintia
 * @since 25-02-2022
 */

public class Item {
    private String name;
    private Item()
    {
        name = "Ipin";
    }
    
    public Item(String name) {
        this.name = new Item().name;
        System.out.println(this.name);
    }
}
