import java.util.Scanner;

/**
 * Created by jc247746 on 8/08/16.
 */
public class MinutesConversion {
    public static void main(String[] args) {
        final int HOURSCONVERSION = 60;
        final int DAYSCONVERSION = 1440;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Yo ");

        double minutes = userInput.nextInt();

        double hours = minutes / HOURSCONVERSION;
        double days = minutes / DAYSCONVERSION;

        System.out.println("Hours = " + hours);
        System.out.println("Days = " + days);
    }
}