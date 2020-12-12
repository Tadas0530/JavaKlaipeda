package sda.kursai.klaipeda.antrapaskaita;

public class Switch {
    public static void main(String[] args) {
        String name = "Petras";

        int dayOfWeekToday = 2;

        switch(dayOfWeekToday) {
            case 1:
                System.out.println("Pirmadienis");
                break;
            case 2:
                System.out.println("Antradienis");
                break;
            case 3:
                System.out.println("Treciadienis");
                break;
            case 4:
                System.out.println("Ketvirtadienis");
                break;
            case 5:
                System.out.println("Penktadienis");
                break;
            case 6:
                System.out.println("Sestadienis");
                break;
            case 7:
                System.out.println("Sekmadienis");
                break;
            default:
                System.out.println("Savaites diena neegzistuoja");
        }


        switch(name) {
            case "Petras":
                System.out.println(name);
            default:
                System.out.println(name);
            case "Jonas":
                System.out.println(name);
                break;
            case "Jonas1":
                System.out.println(name);
        }
    }
}
