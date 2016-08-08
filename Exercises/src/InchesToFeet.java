import java.util.Scanner;

/**
 * Created by jc247746 on 8/08/16.
 */
public class InchesToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value of inches: ");
        int inchesInput = scanner.nextInt();
        int inches = inchesInput % 12;
        int feet = inchesInput / 12;

        System.out.println(inchesInput + " inches becomes " + feet + " feet and " + inches + " inches.");
    }
}
