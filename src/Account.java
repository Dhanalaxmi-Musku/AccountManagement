public class Account {
	private double balance;
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully credited " + amount + " to the account.");
        } else {
            System.out.println("Invalid credit amount. Please enter a positive value.");
        }
    }
    public void debit(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn " + amount + " from the account.");
            } else {
                System.out.println("Debit amount exceeded account balance.");
            }
        } else {
            System.out.println("Invalid debit amount. Please enter a positive value.");
        }
    }
    public double getBalance() {
        return balance;
    }

}
