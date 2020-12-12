package sda.kursai.klaipeda.pirmapaskaita;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        // 1.

        int x = 74;
        int y = 36;
        int result = x + y;
        System.out.println("x = " + x + " y = " + y + ". Ju suma lygi = " + result );
        // 2.

        x = 50;
        y = 3;
        int remainder = 50 % 3;
        result = 50 / 3;
        System.out.println(x + " / " + y + " = " + result + " remainder " + remainder);

        // 3.
        int operation = -5 + 8 * 6;
        System.out.println(operation);
        operation = (55 + 9) % 9;
        System.out.println(operation);
        operation = 20 + (-3)*5 / 8;
        System.out.println(operation);
        operation = 5 + 15 / 3 * 2 -8 % 3;
        System.out.println(operation);

        // 4.
        double operation2 = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(operation2);

        // 5.
        double radius = 7.5d;
        double circleArea = 3.14159265359d * (radius * radius);
        System.out.println(circleArea);

        double perimeter = (2 * 3.14159265359) * radius;
        System.out.println(perimeter);

        // 6.

        Scanner myObj = new Scanner(System.in);
        System.out.println("Pirmasis skaicius: ");
        int num1 = myObj.nextInt();
        System.out.println("Antrasis skaicius: ");
        int num2 = myObj.nextInt();
        System.out.println("Treciasis skaicius: ");
        int num3 = myObj.nextInt();

        int average = (num1 + num2 + num3) / 3;
        System.out.println("Skaiciu vidurkis: " + average);

    }
}


