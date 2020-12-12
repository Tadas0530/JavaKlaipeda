package sda.kursai.klaipeda.ketvirtapaskaita;

public class ShoppingMain {
    public static void main(String[] args) {
        Item[] mondayShoppingList = new Item[3];
        mondayShoppingList[0] = new Item("coffee", 5.5, 500.0);
        mondayShoppingList[1] = new Item("cake", 1000.0);
        mondayShoppingList[2] = new Item();

        ShoppingList cart = new ShoppingList("varle.lt", mondayShoppingList);
        System.out.println(cart.getFinalBalance());

    }
}
