package sda.kursai.klaipeda.ketvirtapaskaita;

public class StringTaskExecutor {
    public static void executeStringTaskNo1() {


        System.out.println("Hello");
        System.out.println("Tadas");
    }

    public static void executeStringTaskNo2() {
        System.out.println("   J    a   V     V  a");
        System.out.println("   J   a a   V   V  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void executeStringTaskNo3() {
        String foxDog = "THE QUICKBROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(foxDog.toLowerCase());
    }

    public static void executeStringTaskNo4() {
        String java = "avaJ";
        String reverse = new StringBuilder(java).reverse().toString();
        System.out.println(reverse);
    }

    public static void executeStringTaskNo5() {
        String inHalf = "Programmer";
        System.out.println(inHalf.substring(0, inHalf.length() / 2));
    }

    public static void executeStringTaskNo6() {
        String string1 = "Java";
        String string2 = "Fundamentals";
        string1 += string2;
        String sum = "";
        for (int i = 0; i < string1.length(); i++) {
            if (Character.isUpperCase(string1.charAt(i))) {
                continue;
            } else {
                sum += string1.charAt(i);
            }
        }
        System.out.println(sum);
    }

    public static void executeStringTaskNo7() {
        String quote = "This is java!";
        System.out.println(quote.length() + " characters");

    }

    public static void executeStringTaskNo8() {
        String text1 = "This is a comparision";
        String text2 = "THIS is A Comparision";
        System.out.println(text1.compareToIgnoreCase(text2));
    }

    public static void executeStringTaskNo9() {
        String text1 = "Java exercises";
        System.out.println(text1.endsWith("ses"));
    }

    public static void executeStringTaskNo10() {
        String text1 = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < text1.length(); i++) {
            if (Character.isLetter(text1.charAt(i))) {
                letters += 1;
            } else if (Character.isSpaceChar(text1.charAt(i))) {
                spaces += 1;
            } else if (Character.isDigit(text1.charAt(i))) {
                numbers += 1;
            } else {
                others += 1;
            }
        }
        System.out.println(letters + " letters " + spaces + " spaces " + numbers + " numbers " + others + " others");
    }
}
