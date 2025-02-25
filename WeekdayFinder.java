import java.util.Scanner;

enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class WeekdayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();
        scanner.close();

        if (dayNumber >= 1 && dayNumber <= 7) {
            Weekday day = Weekday.values()[dayNumber - 1];
            System.out.println("The day is: " + day);
        } else {
            System.out.println("Invalid number! Please enter a value between 1 and 7.");
        }
    }
}
