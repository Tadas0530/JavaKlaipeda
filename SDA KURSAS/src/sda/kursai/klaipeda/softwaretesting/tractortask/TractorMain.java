package sda.kursai.klaipeda.softwaretesting.tractortask;

import java.time.LocalDate;

public class TractorMain {
    public static void main(String[] args) {
        Tractor tractor1 = new Tractor("John-Deer", "7530", 350,
                LocalDate.of(1995, 7, 30), 30000d);

        Tractor tractor2 = new Tractor("Fend", "1050", 280,
                LocalDate.of(1997, 9, 2), 23000d);

        Tractor tractor3 = new Tractor("Belarus", "MTZ-5", 400,
                LocalDate.of(1993, 2, 6), 15000d);

        TractorMethods.findMostExpensiveTractor();
        TractorMethods.findTheOldestTractor();
        TractorMethods.findTanksOver300();
        TractorMethods.modelsWithLatterM();


    }
}
