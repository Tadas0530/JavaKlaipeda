package sda.kursai.klaipeda.softwaretesting.housetask;

public class HouseMain {
    public static void main(String[] args) {
        House house1 = new House(200, "Simonaitytes", 2015, "fitted");
        House house2 = new House(150, "Klaipedos", 2017, "half-finished");
        House house3 = new House(300, "Zemaiciu", 2019, "fitted");

        HouseMethods.findNewestHouse();
        HouseMethods.findSmallestHouse();
        HouseMethods.findFittedHouse();
    }
}