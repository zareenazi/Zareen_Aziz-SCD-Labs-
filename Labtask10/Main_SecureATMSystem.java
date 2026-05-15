import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_SecureATMSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initial balance
        Account user = new Account(5000);

        try {

            System.out.print("Enter withdraw amount: ");
            double amount = input.nextDouble();

            user.withdraw(amount);

        }

        // Non-numeric input
        catch (InputMismatchException e) {

            System.out.println(
                    "Error: Please enter a valid numerical value.");
        }

        // Invalid amount
        catch (InvalidAmountException e) {

            System.out.println("Error: " + e.getMessage());
        }

        // Insufficient funds
        catch (InsufficientFundsException e) {

            System.out.println("Error: " + e.getMessage());
        }

        // Always runs
        finally {

            System.out.println("Transaction Session Ended.");
            input.close();
        }
    }
}