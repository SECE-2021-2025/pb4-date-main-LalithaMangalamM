import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for day, month, year
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Create a Date object with user input
        Date userDate = new Date(day, month, year);

        // Print the user-entered date
        System.out.println("Your entered date: " + userDate.toString());
}
}