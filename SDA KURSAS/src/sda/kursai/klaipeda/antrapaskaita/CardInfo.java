package sda.kursai.klaipeda.antrapaskaita;

public class CardInfo {
    public static void main(String[] args) {
        Card personTadas = new Card("Tadas", "Andrijauskas", true, 300);
        System.out.println(personTadas.getClientLastName() + "'s balance is: " + personTadas.getBalance() + " Euros");
        personTadas.toWithdraw(1);

    }
}
