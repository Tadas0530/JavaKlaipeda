package sda.kursai.klaipeda.pirmapaskaita;

public class Operatoriai {
    public static void main(String[] args) {
        int x = 1;
        x = x +2;
        x += 2; //trumpesnis parasymas
        System.out.println(x); // rezultatas 5
        x -= 3;
        System.out.println(x); // rezultatas 2
        x *= 4;
        x /= 2; //retai naudojami
        System.out.println(x);

        x = 15;
        x = x % 7;
        System.out.println("Liekana: " + x);
        x = 20;
        x++;   // tas pats kas x = x + 1;  naudojama realiuose projektuose
        ++x;
        x--; // naudojama realiuose projektuose
        --x;

        x = 5;
        System.out.println();
        System.out.println("x++ lygu: " + x++);
        System.out.println("po atspausdinimo x lygu: " + x);

        x = 5;
        System.out.println();
        System.out.println("++x lygu: " + ++x);
        System.out.println("po atspausdinimo x lygu: " + x);

        int y;
        y = 10;
        x = 9;
        System.out.println("ar y lygu x: " + (x == y));
        System.out.println("ar y nelygu x: " + (x != y)); // javoj ! reiskia ne


        System.out.println("ar y daugiau x: " + (x > y)); // > ar daugiau >= daugiau arba lygu
        System.out.println("ar y maziau x: " + (x < y));  // < ar maziau <= maziau arba lygu

        boolean value1 = true;
        boolean value2 = false;

        System.out.println(value1 && value2); // && - AND operatorius
        System.out.println(value1 || value2); // || - OR operatorius
        System.out.println(!value1);          // ! - NOT operatorius

    }
}
