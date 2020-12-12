package sda.kursai.klaipeda.ketvirtapaskaita;

import java.util.Scanner;

public class LoopsTaskExecutor {
    public static void loopExerciseNo1() {
        int number = 5;
        int multiplication = 0;
        for (int i = 1; i <= 10; i++) {
            multiplication = number * i;
            System.out.print(multiplication + ", ");
        }
    }

    public static void loopExerciseNo2() {
        int number = 100;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void loopExerciseNo3(int number) {
        for (int i = 0; i < number; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(number);
            }
        }
    }

    public static void loopExerciseNo4() {
        System.out.print("Divisable by 3: ");
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 100; k++) {
                if ((k % 3 == 0) && (i == 1)) {
                    System.out.print(k + ", ");
                    if (k == 99) {
                        System.out.print("\nDivisable by 5: ");
                    }
                }
                if ((k % 5 == 0) && (i == 2)) {
                    System.out.print(k + ", ");
                    if (k == 90) {
                        System.out.print("\nDivisable by 3 and 5: ");
                    }
                }
                if (((k % 3 == 0) && (k % 5 == 0)) && (i == 3)) {
                    System.out.print(k + ", ");
                }
            }
        }
    }

    public static void loopExerciseNo5() {
        int number = 3;
        int number2 = number;
        System.out.println(number);
        while(number <= 100) {
            number = number * number2;
            if(number <= 100) {
                System.out.println(number);
            }
        }
    }
}



