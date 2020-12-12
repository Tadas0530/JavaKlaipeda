package sda.kursai.klaipeda.antrapaskaita;

public class Homework {
    public static void main(String[] args) {
        int number = 28;                                // fizzbuzz
        boolean divisableBy5 = number % 5 == 0;
        boolean divisableBy3 = number % 3 == 0;
        if (divisableBy3 && !divisableBy5) {
            System.out.println("fizz");
        } else if (divisableBy5 && !divisableBy3) {
            System.out.println("buzz");
        } else if (divisableBy3 && number % 5 == 0) {
            System.out.println("fizzbuzz");
        }
        System.out.println();

        String areaOfContinent = "Antarctica";                                              // continents land of area

        switch (areaOfContinent) {
            case "Asia":
                System.out.println(areaOfContinent + "'s land area is: 44 580 000 km²");
                break;
            case "N/S america":
                System.out.println(areaOfContinent + "'s land area is: 42 550 000 km²");
                break;
            case "Europe":
                System.out.println(areaOfContinent + "'s land area is: 10 180 000 km²");
                break;
            case "Antarctica":
                System.out.println(areaOfContinent + "'s land area is: 14 200 000 km²");
                break;
            case "Australia":
                System.out.println(areaOfContinent + "'s land area is: 7 692 000 km²");
                break;
            case "Africa":
                System.out.println(areaOfContinent + "'s land area is: 30 370 000 km²");
                break;
            default:
                System.out.println("Region does not exist");
        }
        System.out.println();


        int sum = 0;                                            // 1 uzduotis arrays
        int[] arr = new int[]{5, 9, 18, 4, 26};
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("Array sum: " + sum);

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println("Max value of array: " + max);

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        System.out.println("Min value of array: " + min);

        System.out.println();

        // 2 uzduotis arrays

        int[] array = new int[]{5, 5, 8, 14, 3, 3, 14};
        int minValue = array[0];
        int minIndex = 0;
        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
                minValue = Math.min(array[i], minValue);
                maxValue = Math.max(array[i], maxValue);
                if (array[i] == minValue) {
                    minIndex = i;
                } else if (array[i] == maxValue) {
                    maxIndex = i;
            }
        }
        System.out.println("Smallest value is: " + minValue + " at index: " + minIndex);
        System.out.println("Biggest value is: " + maxValue + " at index: " + maxIndex);

        System.out.println();

        // 3 uzduotis arrays
        int multiSum = 0;
        int[][] multiArray = new int[][]{
                {3, 5, 7, 9, 10},
                {8, 3, 14, 5, 32},
        };
        int multiMin = multiArray[0][0];
        int multiMax = multiArray[0][0];
        int minRowIndex = 0;
        int minColumnIndex = 0;
        int maxRowIndex = 0;
        int maxColumnIndex = 0;
        for (int i = 0; i < multiArray.length; i++) {
            for (int k = 0; k < multiArray[i].length; k++) {
                multiSum += multiArray[i][k];
                multiMin = Math.min(multiArray[i][k], multiMin);
                multiMax = Math.max(multiArray[i][k], multiMax);
                if(multiArray[i][k] == minValue) {
                    minRowIndex = i;
                    minColumnIndex = k;
                }
                if(multiArray[i][k] == multiMax) {
                    maxRowIndex = i;
                    maxColumnIndex = k;
                }
            }
        }
        System.out.println("Multiarray sum: " + multiSum);
        System.out.println("Multiarray MIN value: " + multiMin + " at index: " + minRowIndex + " " + minColumnIndex);
        System.out.println("Multiarray MAX value: " + multiMax + " at index: " + maxRowIndex + " " + maxColumnIndex);
    }
}