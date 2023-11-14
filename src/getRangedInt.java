import java.util.Scanner;

class getRangedInt {
    /**
     * Prompts the user to input an integer within a specified inclusive range.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the prompt message for the user (without the [lo - hi] display)
     * @param low    the low value for the input range
     * @param high   the high value for the input range
     * @return an integer input by the user within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                if (value >= low && value <= high) {
                    validInput = true;
                } else {
                    System.out.println("Value must be within the specified range.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                // Clear the input buffer
                pipe.next();
            }
        } while (!validInput);

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1; // Example low value
        int high = 10; // Example high value
        int userInt = getRangedInt(scanner, "Enter an integer within the range", low, high);
        System.out.println("You entered: " + userInt);
        scanner.close();
    }
}