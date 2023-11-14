import java.util.Scanner;

class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius (°C)\tFahrenheit (°F)");
        System.out.println("-----------------------------");

        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%d\t\t%.2f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}