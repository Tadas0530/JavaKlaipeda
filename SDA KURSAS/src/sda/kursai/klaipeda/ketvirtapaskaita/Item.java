package sda.kursai.klaipeda.ketvirtapaskaita;

public class Item {
    private String name;
    private double price;
    private double weight;
    private int x;

    public Item(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }



    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.weight = 0;
    }

    public Item() {
        this.name = "Unknown item";
        this.price = 0;
        this.weight = 0;
    }

    public Item(double weight, double price) {

    }

    public double getPrice(double antkainis) {
        return this.price + antkainis;
    }

    public double getPrice() {
        return price;
    }
}
