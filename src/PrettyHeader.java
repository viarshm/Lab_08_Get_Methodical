import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        prettyHeader("Message Centered Here");
    }

    public static void prettyHeader(String msg) {
        int headerWidth = 60;
        int messageWidth = msg.length();

        if (messageWidth > headerWidth - 6) {
            System.out.println("Message is too long for the header width.");
            return;
        }

        int starsOnEachSide = (headerWidth - messageWidth - 6) / 2;

        // Print the top line of stars
        for (int i = 0; i < headerWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the second line with centered message
        System.out.print("***");
        for (int i = 0; i < starsOnEachSide; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < starsOnEachSide; i++) {
            System.out.print(" ");
        }
        if (messageWidth % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom line of stars
        for (int i = 0; i < headerWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}