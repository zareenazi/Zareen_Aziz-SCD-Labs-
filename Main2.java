public class Main2 {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Zareen_Aziz5044", 0.0);
        BankAccount account2 = new BankAccount("Zarii5045", 1000.0);

        account2.deposit(3000);
        account2.withdraw(500);
        account2.displayAccountInfo();
       
        account1.withdraw(-100);
        account1.withdraw(50);
        account1.displayAccountInfo();

        System.out.println("Account Holder: " + account1.getAccountHolder());
        System.out.println("Final Details: " + account1.getBalance());
        
        System.out.println("Account Holder: " + account2.getAccountHolder());
        System.out.println("Final Details: " + account2.getBalance());
    }

}