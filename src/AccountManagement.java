import java.util.Scanner;

public class AccountManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial account balance: ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(initialBalance);
        while (true) {
            // Display menu options
            System.out.println("\n--- Account Management  ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    account.credit(creditAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double debitAmount = scanner.nextDouble();
                    account.debit(debitAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using Account Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

	}

}
