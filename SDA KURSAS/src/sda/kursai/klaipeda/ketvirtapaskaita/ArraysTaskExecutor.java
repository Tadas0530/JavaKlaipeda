package sda.kursai.klaipeda.ketvirtapaskaita;

public class ArraysTaskExecutor {
    private static int[] array = {1, 7, 3, 10, 9};

    public static void arrayExerciseNo1() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void arrayExerciseNo2() {
        int sum = 0;
        int average = 0;
        for (int i : array) {
            sum += i;
        }
        average = sum / array.length;
        System.out.println(average);
    }

    public static void arrayExerciseNo3() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void arrayExerciseNo4() {
        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            minValue = Math.min(array[i], minValue);
            maxValue = Math.max(array[i], maxValue);
        }
        System.out.println("Min: " + minValue + " Max: " + maxValue);
    }

    public static void arrayExerciseNo5() {
        for (int i = array.length - 1; i < array.length; i--) {
            System.out.print(array[i] + " ");
            if (i == 0) {
                break;
            }
        }
    }

    public static void arrayExerciseNo6() {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            } else if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }
}
