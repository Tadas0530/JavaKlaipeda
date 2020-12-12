package sda.kursai.klaipeda.antrapaskaita;

public class ConditionalStatements {
    public static void main(String[] args) {
        // checkAge();
        int randomNumber = 0;
        boolean isEvenNumber = 10 % 2 == 0 && randomNumber !=0;
        boolean isRandomNumberZero = randomNumber == 0;

        if (isEvenNumber && !isRandomNumberZero) {
            System.out.println("Number is even");
        } else if (!isRandomNumberZero) {
            System.out.println("Number is 0");
        }
        else {
            System.out.println("Number is odd");
        }
    }
    private static void checkAge() {
        byte jonasAge = 20;
        byte petrasAge = 30;

        boolean isJonasOlderThanPetras = jonasAge > petrasAge;
        boolean isJonasSameAgeAsPetras = jonasAge == petrasAge;

        if (isJonasOlderThanPetras) {
            System.out.println("Jonas is older than Petras");
        } else if (isJonasSameAgeAsPetras) {
            System.out.println("Jonas and Petras are same age");
        } else {
            System.out.println("Jonas is not older than Petras");
        }
    }

}
