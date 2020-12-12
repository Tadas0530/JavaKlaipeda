package sda.kursai.klaipeda.penktapaskaita;

public class KatilasMain {
    public static void main(String[] args) {
        DujinisKatilas.getModel();
        DujinisKatilas katilas = new DujinisKatilas(20.8, "Bosch x20");
        katilas.katilasSildo();
        DujinisKatilas.getModel();
        DujinisKatilas katilas2 = new DujinisKatilas(30.2,"modelis");
        katilas.getModel();
    }
}
