import java.util.Scanner;

class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = getRegExString(scanner, "Enter a valid SSN (###-##-####): ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered a valid SSN: " + ssn);

        // Test UC Student M number pattern: ^(M|m)\d{5}$
        String mNumber = getRegExString(scanner, "Enter a valid UC Student M number (M###### or m######): ", "^[Mm]\\d{6}$");
        System.out.println("You entered a valid UC Student M number: " + mNumber);

        // Test menu choice pattern: ^[OoSsVvQq]$
        String menuChoice = getRegExString(scanner, "Enter a menu choice (O, S, V, or Q): ", "^[OoSsVvQq]$");
        System.out.println("You entered a valid menu choice: " + menuChoice);

        scanner.close();
    }

    public static String getRegExString(Scanner scanner, String prompt, String regexPattern) {
        String input;
        do {
            System.out.println(prompt);
            input = scanner.next().trim();
        } while (!input.matches(regexPattern));

        return input;
    }
}
