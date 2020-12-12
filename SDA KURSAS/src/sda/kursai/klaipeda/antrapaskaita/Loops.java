package sda.kursai.klaipeda.antrapaskaita;

public class Loops {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        short age = 1;

        while (age <= 18) {
            System.out.println("You can not vote");
        }

    }
}
