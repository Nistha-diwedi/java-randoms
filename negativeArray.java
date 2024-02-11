import java.util.Scanner;

public class negativeArray {
    public static void main(String[] args) {
        try {
            int size = getArraySize();
            int[] array = new int[size];

            System.out.println("Array created successfully with size: " + size);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative.");
        }
    }
    private static int getArraySize() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        if (size < 0) {
            throw new NegativeArraySizeException();
        }

        return size;
    }
}
