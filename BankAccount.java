public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {

        this.accountHolder = accountHolder;

        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial Balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Transaction Failed. Invalid amount");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}