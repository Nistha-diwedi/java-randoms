import java.util.Scanner;

public class loanAmountCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter details for Loan :-");

        System.out.print("Enter Principal Amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = scanner.nextInt();

        double interest = (principalAmount * annualRate * years) / 100.0;
        interest = Math.round(interest * 10.0) / 10.0; // Truncate to one decimal place

        System.out.println("Simple Interest for Loan : " + interest);

    }
}

