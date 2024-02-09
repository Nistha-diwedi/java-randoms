import java.util.Scanner;
public class HackathonQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPercentage = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the percentage of Friend " + i + ": ");
            double friendPercentage = scanner.nextDouble();
            totalPercentage += friendPercentage;
        }
        double averagePercentage = totalPercentage / 5;

        System.out.print("Does your group have a letter of invitation? (yes/no): ");
        String Letter = scanner.next().toLowerCase();

        System.out.print("Do you have permission from HOD? (yes/no): ");
        String hodPer = scanner.next().toLowerCase();

        if (averagePercentage > 75 && (Letter.equals("yes") || hodPer.equals("yes"))) {
            System.out.println("Your group can participate in the hackathon quiz!");
        } else {
            System.out.println("Your group cannot participate in the hackathon quiz.");
        }
    }
}

