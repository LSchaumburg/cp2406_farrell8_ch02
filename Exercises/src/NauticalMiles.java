import java.util.Scanner;

/**
 * Created by jc247746 on 8/08/16.
 */


public class NauticalMiles {

    public static void main(String[] args) {
        final double KILOMETERS = 1.852;
        final double MILES = 1.150779;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter how many nautical miles: ");

        double nauticalMiles = userInput.nextInt();

        double kilometerEquation = nauticalMiles * KILOMETERS;
        double milesEquation = nauticalMiles * MILES;

        System.out.println("nautical miles in kilometers: " + kilometerEquation);
        System.out.println("nautical miles in miles: " + milesEquation);

    }
}
