package sda.kursai.klaipeda.softwaretesting.tractortask;

import java.time.LocalDate;

public class Tractor {
    private String tractorMaker;
    private String model;
    private int tankSize;
    private LocalDate make;
    private double price;

    public Tractor(String tractorMaker, String model, int tankSize, LocalDate make, double price) {
        TractorMethods.addTractorObjToArray(Tractor.this);
        this.tractorMaker = tractorMaker;
        this.model = model;
        this.tankSize = tankSize;
        this.make = make;
        this.price = price;
    }

    public String getTractorMaker() {
        return tractorMaker;
    }

    public String getModel() {
        return model;
    }

    public int getTankSize() {
        return tankSize;
    }

    public LocalDate getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }
}
