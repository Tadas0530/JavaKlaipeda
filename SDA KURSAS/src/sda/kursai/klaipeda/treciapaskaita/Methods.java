package sda.kursai.klaipeda.treciapaskaita;

public class Methods {
    public static void main(String[] args) {
        int changedNumber = changeNumber(101,5);
        System.out.println(changedNumber);
        greetings("Petras");
        int numberOfStudents = getStudentCount();
        System.out.println(numberOfStudents);

    }
    public static int changeNumber(int numberToChange, int valueToChange) {
        if(numberToChange > 100) {
            return numberToChange+valueToChange;
        } else if(numberToChange < 100) {
            return numberToChange-valueToChange;
        }
        return numberToChange;
    }
    public static void greetings(String name) {
        System.out.println("Greetings, " + name);
    }
    public static int getStudentCount() {
        return 12;
    }
}