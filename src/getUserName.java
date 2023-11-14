import java.util.Scanner;

class getUserName {
    // ... other methods ...

    /**
     * Prompts the user for a string input and ensures it is not zero length.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the prompt message for the user
     * @return a non-zero length string input by the user
     */
    public static String getZeroLengthString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine().trim(); // Read user input and remove leading/trailing spaces
        } while (retString.isEmpty());
        return retString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = getZeroLengthString(scanner, "Enter a non-empty string");
        System.out.println("You entered: " + userString);
        scanner.close();
    }
}