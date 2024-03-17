import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        Date userDate = new Date(day, month, year);

        System.out.println("Your entered date: " + userDate.toString());
}
}