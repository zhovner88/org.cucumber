package implementation;

public class Account {

    private int balance;

    public void deposit(Money amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

}
