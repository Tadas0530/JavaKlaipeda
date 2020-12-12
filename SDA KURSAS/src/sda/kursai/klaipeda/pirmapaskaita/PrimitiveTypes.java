package sda.kursai.klaipeda.pirmapaskaita;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte baitoTipas = 1;
        System.out.println("Byte: " + baitoTipas);
        short shortTipas;
        shortTipas = 2;
        System.out.println("Short: " + shortTipas);
        int intTipas = 10000;
        System.out.println("Integer: " + intTipas);
        long longTipas = 156654656L;
        System.out.println("Long: " + longTipas);
        int x = 1;
        int y = 2;
        int result = x + y;
        System.out.println("Rezultatas yra: " + result);
        float floatTipas = 1.0f;
        System.out.println("Float: " + floatTipas);
        double doubleTipas = 1.0d;
        System.out.println("Double: " + doubleTipas);

        boolean isGeras;

        isGeras = true;
        System.out.println("Ar geras? " + isGeras);
        isGeras = false;
        System.out.println("Ar tikrai geras? " + isGeras);

        char simbolis = 'a' - 4;  //galima atimti ar prideti, kitai unicodo reiksmei
        System.out.println(simbolis);
        // System.out.println('aa'); talpina tik viena simboli

        char tabas = '\t';
        char newLine= '\n';
        char r = 'r';
        System.out.print("Labas" + tabas);
        System.out.print("Labas" + newLine);
        System.out.print("Labas");
        System.out.print("Labas");

        simbolis = 97; // tipas kuris saugo arba simboli arba teigiama skaiciu
        System.out.println(simbolis);

    }
}
