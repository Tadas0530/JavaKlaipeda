package sda.kursai.klaipeda.treciapaskaita;

public class Casting {
    public static void main(String[] args) {
        byte b = 1;
        short s = 10;
        int i = 129;
        float f = 3549f;
        long l = 1052;
        double d = 85.2;
        boolean bool = false;
        char c = 8;

        short byteToShort = b;
        byte shortToBytes = (byte) s;
        byte intToByte = (byte) i;

        int sum = b + b;
        float newSum = sum + f;
        System.out.println(intToByte);
        c = (char) newSum;

        c = (char) newSum;

        i = (int) d;
    }
}
