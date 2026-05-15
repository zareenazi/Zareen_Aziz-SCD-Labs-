public class Account {

    double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Withdraw Method
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        // Invalid amount check
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "You cannot withdraw a negative or zero amount.");
        }

        // Insufficient balance check
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient balance in your account.");
        }

        // Successful withdrawal
        balance -= amount;

        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: " + balance);
    }
}