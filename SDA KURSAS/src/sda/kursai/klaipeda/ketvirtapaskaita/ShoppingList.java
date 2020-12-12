package sda.kursai.klaipeda.ketvirtapaskaita;

public class ShoppingList {
    private String shopName;
    private Item[] items;
    private double finalBalance;

    public ShoppingList(String shopName, Item[] items) {
        this.shopName = shopName;
        this.items = items;
        this.finalBalance = 0;
        for(int i = 0; i < items.length;  i++) {
            finalBalance += items[i].getPrice();
        }
    }

    public double getFinalBalance() {
        return finalBalance;
    }


}
