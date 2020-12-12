package sda.kursai.klaipeda.antrapaskaita;

public class Card {
    private String clientFirstName;
    private String clientLastName;
    private boolean isWorking;
    private int balance;
    private int cardCount;

    public Card(String clientFirstName, String clientLastName,
                boolean isWorking, int balance) {
        this.cardCount =+1;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.isWorking = isWorking;
        this.balance = balance;
    }

    public int getCardCount() {
        return cardCount;
    }
    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void toDeposit(int deposit) {
        this.balance += deposit;
        System.out.println("You deposited: " + deposit + " Euros. Your new balance is:  " + this.balance + " Euros");
    }
    public void toWithdraw(int withdraw) {
        if(withdraw <= this.balance) {
            this.balance -= withdraw;
            System.out.println("You withdrew: " + withdraw + " Euros. Your new balance is:  " + this.balance + " Euros");
        } else {
            System.out.println("Insufficient funds to withdraw. Please deposit.");
        }
    }
}

