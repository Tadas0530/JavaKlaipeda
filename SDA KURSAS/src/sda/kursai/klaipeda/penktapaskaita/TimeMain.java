package sda.kursai.klaipeda.penktapaskaita;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 5, 30);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        LocalDate localDate1 = localDate;
        String formattedLocalTime = localDate1.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formattedLocalTime);

    }
}
