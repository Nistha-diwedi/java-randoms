import java.util.*;
public class DhoniPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Did Dhoni complete his homework? (yes/no): ");
        String homeworkCompleted = scanner.nextLine();

        System.out.print("Did Dhoni take lunch? (yes/no): ");
        String lunchTaken = scanner.nextLine();

        // Check father's decision based on homework and lunch
        if (homeworkCompleted.equals("yes") && lunchTaken.equals("yes")) {
            System.out.println("Dhoni's father says: Yes, you can go play!");
        } else {
            System.out.println("Dhoni's father says: No, you cannot go play.");
        }
    }
}

