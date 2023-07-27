import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ANSI escape code for pink text
        String pinkColorCode = "\u001B[35m";
        // ANSI escape code for blue text
        String blueColorCode = "\u001B[34m";
        // ANSI escape code to reset text color to default
        String resetColorCode = "\u001B[0m";

        System.out.println(pinkColorCode + "Assignment1");

        //Ex1
        System.out.println(blueColorCode + "Hello");
        System.out.println("Tabitha" + resetColorCode);

        //Ex2
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter an integer: ");
        int int1 = scan.nextInt();
        System.out.println("Enter another integer: ");
        int int2 = scan.nextInt();
        int sum = int1 + int2;
        System.out.printf("%d + %d = %d", int1, int2, sum);

        //Ex3
        System.out.println("\nEnter the numerator:");
        double numerator = scan.nextInt();
        System.out.println("Enter the denominator:");
        double denominator = scan.nextInt();
        double divisionResult  = (double) numerator/denominator;
        System.out.printf("%.5f / %.5f = %.5f\n\n", numerator, denominator, divisionResult );

        //Ex4
        System.out.println("The result of the following operations are:");

        // a. -5 + 8 * 6
        int resultA = -5 + 8 * 6;
        System.out.println("\na. -5 + 8 * 6 = " + resultA);

        // b. (55+9) % 9
        int resultB = (55 + 9) % 9;
        System.out.println("\nb. (55+9) % 9 = " + resultB);

        // c. 20 + (-3) * 5 / 8
        double resultC = 20 + (-3) * 5 / 8.0; // Using 8.0 instead of 8 to get a decimal result
        System.out.println("\n20 + (-3) * 5 / 8 = " + resultC);

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("\n5 + 15 / 3 * 2 - 8 % 3 = " + resultD);
    }
}