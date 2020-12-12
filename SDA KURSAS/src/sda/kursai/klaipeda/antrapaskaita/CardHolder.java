package sda.kursai.klaipeda.antrapaskaita;

public class CardHolder {
    private String[] cardCount = new String[4];
    private String[] users = new String[cardCount.length];
    private int position;

    private int activeCards() {
        int count = 0;
        for (String s : cardCount) {
            if (s == null) {
            } else {
                count += 1;
            }
        }
        return count;
    }

    public void cardSlots() {                                   // grazina kiek korteliu siuo metu sukurta
        System.out.println("Card holder has " + activeCards() +  // taip pat kiek dar galima sukurti
                " active cards. Remaining slots: "
                + (cardCount.length - activeCards()) + ".");
    }

    public void addCard(String user, String cardName) {         // metodas sukurti nauja kortele, bei istrina
        for (int i = 0; i < cardCount.length; i++) {            // seniausia jeigu laikytuve korteliu per daug
            if (activeCards() == cardCount.length) {
                if (cardCount[i] != null) {
                    cardCount[this.position] = null;
                    users[this.position] = null;
                }
            }
            if (cardCount[i] == null) {
                users[i] = user;
                cardCount[i] = cardName;
                this.position++;
                if (this.position == cardCount.length) {
                    this.position = 0;
                }
                System.out.println("A new card has been added: " + cardName + " to user: " + this.users[i] + ".");
                break;
            }
        }
    }

    public void returnCardByName(String name) {     // metodas grazinti kortele pagal kliento pavarde/varda
        boolean isNull = true;
        for (int i = 0; i < users.length; i++) {
            if (this.users[i] == name) {
                System.out.println(cardCount[i]);
                isNull = false;
            }
        }
        if (isNull) {
            name = null;
            System.out.println(name);
        }
    }
}

