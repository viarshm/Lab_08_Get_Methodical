import java.util.Scanner;

class BirthInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = getRangedInt.getRangedInt(scanner, "Enter your birth year (1950-2015)", 1950, 2015);
        int birthMonth = getRangedInt.getRangedInt(scanner, "Enter your birth month (1-12)", 1, 12);
        int birthDay = getValidBirthDay(scanner, birthMonth);
        int birthHour = getRangedInt.getRangedInt(scanner, "Enter the hour of your birth (1-24)", 1, 24);
        int birthMinute = getRangedInt.getRangedInt(scanner, "Enter the minute of your birth (1-59)", 1, 59);

        System.out.println("Your birth date and time: " + birthYear + "-" + birthMonth + "-" + birthDay + " " + birthHour + ":" + birthMinute);

        scanner.close();
    }
    public static int getValidBirthDay(Scanner scanner, int birthMonth) {
        int birthDay;

        switch (birthMonth) {
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                birthDay = getRangedInt.getRangedInt(scanner, "Enter your birth day (1-30)", 1, 30);
                break;
            case 2: // February
                birthDay = getRangedInt.getRangedInt(scanner, "Enter your birth day (1-29)", 1, 29);
                break;
            default:
                birthDay = getRangedInt.getRangedInt(scanner, "Enter your birth day (1-31)", 1, 31);
                break;
        }

        return birthDay;
    }
}