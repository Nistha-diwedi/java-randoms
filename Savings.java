class SavingsAccount{
    static double annualInterestRate;
    private double savingsBalance;
    SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest = (annualInterestRate * savingsBalance)/12;
        savingsBalance += monthlyInterest;
    }
    static void modifyInterestRate(double newrate){
        annualInterestRate = newrate;
    }
    public double getsavingsBalance(){
        return savingsBalance;
    }
}
public class Savings {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("interest of month 1 = 4%");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 balance: $" + saver1.getsavingsBalance());
        System.out.println("Saver2 balance: $" + saver2.getsavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\ninterest of month 2 = 5%");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 balance: $" + saver1.getsavingsBalance());
        System.out.println("Saver2 balance: $" + saver2.getsavingsBalance());    }
}
