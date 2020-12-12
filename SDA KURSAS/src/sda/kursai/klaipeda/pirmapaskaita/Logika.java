package sda.kursai.klaipeda.pirmapaskaita;
import java.util.Scanner;

public class Logika {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Koks Jusu ugis? ");
        int ugis = myObj.nextInt();
        System.out.println("Koks Jusu svoris? ");
        int svoris = myObj.nextInt();
        System.out.println("Koks Jusu amzius? ");
        int amzius = myObj.nextInt();
        boolean arGaliu = ((ugis > 150) && (svoris <= 180)) || (amzius == 25);
        System.out.println("Ar galiu keliauti karusele?: " + arGaliu);
    }
}
