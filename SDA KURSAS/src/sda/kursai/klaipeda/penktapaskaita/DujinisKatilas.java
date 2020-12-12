package sda.kursai.klaipeda.penktapaskaita;

public class DujinisKatilas {
    public double temperatura;
    public static String model = "Bosch 4894";

    public DujinisKatilas(double temperatura, String model) {
        this.temperatura = temperatura;
        this.model = model;
    }

    public static void getModel() {
        System.out.println(model);
    }

    public void katilasSildo() {
        System.out.println("Katilas pradeda sildyti. Dabartine temperatura: " + temperatura + "°C");
    }
}

