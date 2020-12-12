package sda.kursai.klaipeda.softwaretesting.tractortask;

import java.time.LocalDate;

public class TractorMethods {

    private static Tractor[] tractorArray = new Tractor[3];

    static void addTractorObjToArray(Tractor tractor) {
        for (int i = 0; i < tractorArray.length; i++) {
            if (tractorArray[i] == null) {
                tractorArray[i] = tractor;
                break;
            }
        }
    }

    public static String findMostExpensiveTractor() {
        double price = 0d;
        String name = "No tractor found";
        for (Tractor tractor : tractorArray) {
            if (tractor.getPrice() > price) {
                price = tractor.getPrice();
                name = tractor.getTractorMaker() + " " + tractor.getModel();
            }
        }
        System.out.println("Most expensive tractor is " + name + ".");
        return name;
    }

    public static String findTheOldestTractor() {
        LocalDate oldest = LocalDate.now();
        String name = "No tractor found";
        for (Tractor tractor : tractorArray) {
            if (oldest.isAfter(tractor.getMake())) {
                oldest = tractor.getMake();
                name = tractor.getTractorMaker() + " " + tractor.getModel();
            }
        }
        System.out.println("The oldest tractor is: " + name + ".");
        return name;
    }

    public static int findTanksOver300() {
        int count = 0;
        for (Tractor tractor : tractorArray) {
            if (tractor.getTankSize() > 300) {
                System.out.println(tractor.getTractorMaker() +
                        " " + tractor.getModel() + " has over 300 liters of tank capacity.");
                count++;
            }
        }
        return count;
    }

    public static int modelsWithLatterM() {
        int count = 0;
        String regex = "^[Mm].*";
        for (Tractor tractor : tractorArray) {
            if (tractor.getModel().matches(regex)) {
                System.out.println(tractor.getTractorMaker() + "'s " + tractor.getModel() + " model" +
                        " starts with letter M.");
                count++;
            }
        }
        return count;
    }
}
