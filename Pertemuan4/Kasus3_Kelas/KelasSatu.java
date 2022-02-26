package Kasus3_Kelas;

class KelasSatu {
    {
        System.out.println(11);
    }
    static
    {
        System.out.println(2);
    }
    
    public KelasSatu(int i)     //constructor KelasSatu dengan parameter i yang bertipe integer
    {
        System.out.println(3);
    }
    
    public KelasSatu()          //constructor KelasSatu
    {
        System.out.println(4);
    }
}
