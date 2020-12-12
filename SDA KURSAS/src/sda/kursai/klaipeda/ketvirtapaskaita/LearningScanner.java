package sda.kursai.klaipeda.ketvirtapaskaita;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        long l = scanner.nextLong();
        float f = scanner.nextFloat();
        System.out.println("Your name: " + name + ".");
        System.out.println("Your long value: " + l);
        System.out.println("Your float value: " + f);

    }
}
