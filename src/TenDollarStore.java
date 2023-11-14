import java.util.Scanner;

class TenDollarStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0; // Use double to store the total cost

        do {
            double itemPrice = getRangedDouble(scanner, "Enter the item price ($0.50 - $10.00)", 0.50, 10.00);
            totalCost += itemPrice;

            boolean moreItems = getYNConfirm(scanner, "Do you have more items to add? (Y/N)");
            if (!moreItems) {
                break;
            }
        } while (true);

        System.out.printf("Total cost of items: $%.2f%n", totalCost); // Display total cost with two decimal places
        scanner.close();
    }

    public static double getRangedDouble(Scanner scanner, String prompt, double min, double max) {
        double input;
        do {
            System.out.println(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // consume the invalid input
            }
            input = scanner.nextDouble();
        } while (input < min || input > max);

        return input;
    }

    public static boolean getYNConfirm(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.println(prompt);
            input = scanner.next().trim().toUpperCase();
        } while (!input.equals("Y") && !input.equals("N"));

        return input.equals("Y");
    }
}
