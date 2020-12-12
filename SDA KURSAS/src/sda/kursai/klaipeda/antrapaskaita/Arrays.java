package sda.kursai.klaipeda.antrapaskaita;

public class Arrays {
    public static void main(String[] args) {
        // One-dimensional arrays
            // int [] array = new int[3];
            // int [] array = new int[]{8,24,46}
        // Multi-dimensional arrays
            // [Alice, has, the, cat]
            // [The, cat, has, Alice]
            // arr[0] = [Alice, has, the, cat]
            // arr[0][2] = the
            // int [][]doubleArray = new int [3][3]  sukurimas

        int[] arr = new int[5];
        int[] arrayWithValues = new int[]{5,8,7,9};
        int[] arrNew = {5,8,7,9};

        int firstElement = arr[0];
        int lastElementOfArrayWithValues = arrayWithValues[arrayWithValues.length-1];

        System.out.println(lastElementOfArrayWithValues);

        int[][] multiDimensionalArray = new int[3][];
        multiDimensionalArray[0] = arrayWithValues;
        multiDimensionalArray[1] = arrNew;

        int[] smallerArray = {2};
        multiDimensionalArray[2] = smallerArray;

        int[] lastMultiDimensionalArray = multiDimensionalArray[multiDimensionalArray.length-1];

        System.out.println(multiDimensionalArray.length-1);

        for (int value : arrayWithValues) {
            System.out.println(value);
        }

        System.out.println("___multiDimensionalArray iteration___");
        System.out.println();

        for(int i = 0; i < multiDimensionalArray.length; i++) {
            System.out.println();
            for(int k = 0; k < multiDimensionalArray[i].length; k++) {
                System.out.print(multiDimensionalArray[i][k] + ",");
            }
        }
    }
}
