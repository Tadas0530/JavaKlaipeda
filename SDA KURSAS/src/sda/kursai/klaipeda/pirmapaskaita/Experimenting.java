package sda.kursai.klaipeda.pirmapaskaita;
import java.util.Scanner;

public class Experimenting {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i = 0;
        int left = 0;
        int number = 0;
        while (i < 10) {
            System.out.println("Add numbers to show their average: ");
            number += myObj.nextInt();
            System.out.println("Total: " + number);
            i++;
            int formula = number / i;
            left = 10 - i;
            System.out.println("You can add more numbers: " + left);
            System.out.println("Numbers average is: " + formula);

        }

    }
}
