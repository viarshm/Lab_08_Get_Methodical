import java.util.Scanner;

class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favoriteInteger = getInt(scanner, "Enter your favorite integer");
        double favoriteDouble = getDouble(scanner, "Enter your favorite double");

        System.out.println("Your favorite integer: " + favoriteInteger);
        System.out.println("Your favorite double: " + favoriteDouble);

        scanner.close();
    }

    public static int getInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // consume the invalid input
        }
        return scanner.nextInt();
    }

    public static double getDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a double.");
            scanner.next(); // consume the invalid input
        }
        return scanner.nextDouble();
    }
}