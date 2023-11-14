import java.util.Scanner;

class getYNConfirm {
    /**
     * Prompts the user to input a Yes or No [Y/N] response and returns true for 'Yes' and false for 'No'.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the prompt message for the user
     * @return true for 'Yes' and false for 'No'
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean isYes = false;
        boolean validInput = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            String response = pipe.next().toLowerCase(); // Read user input in lowercase

            if (response.equals("y") || response.equals("n")) {
                isYes = response.equals("y");
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter Y for Yes or N for No.");
            }
        } while (!validInput);

        return isYes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isConfirmed = getYNConfirm(scanner, "Are you sure?");
        if (isConfirmed) {
            System.out.println("You confirmed with 'Yes'.");
        } else {
            System.out.println("You confirmed with 'No'.");
        }
        scanner.close();
    }
}