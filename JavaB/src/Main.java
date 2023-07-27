import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ANSI escape code for pink text
        String pinkColorCode = "\u001B[35m";
        // ANSI escape code for blue text
        String blueColorCode = "\u001B[34m";
        // ANSI escape code to reset text color to default
        String resetColorCode = "\u001B[0m";

        System.out.println(pinkColorCode + "Assignment2" + resetColorCode);

        //Ex1
        printMyName();
        printSum();
        printDivision();
        printOperations();

        //Ex2
        double x = 10;
        double y = 3;
        System.out.printf("%.5f + %.5f = %.5f\n", x, y, sum(x,y));
        System.out.printf("%.5f - %.5f = %.5f\n", x, y, subtraction(x,y));
        System.out.printf("%.5f * %.5f = %.5f\n", x, y, multiplication(x,y));
        System.out.printf("%.5f / %.5f = %.5f\n", x, y, division(x,y));
        System.out.println(blueColorCode);

        //Ex3
        printRobot();
        System.out.println(resetColorCode);

        //Ex4
        double num1 = 10;
        double num2 = 15;
        double num3 = 20;

        double result = calculateArithmeticMean(num1, num2, num3);
        System.out.println("The arithmetic mean of " + blueColorCode + num1 + resetColorCode + ", " + blueColorCode + num2 + resetColorCode + ", and " + blueColorCode + num3 + resetColorCode + " is: " + pinkColorCode + num2 + resetColorCode);

        //Ex5
        int number1 = 15;
        int number2 = 7;

        int remainder = calculateDivisionRemainder(number1, number2);
        System.out.println("The remainder of dividing " + blueColorCode + number1 + resetColorCode + " by " + blueColorCode + number2 + resetColorCode + " is: " + pinkColorCode + remainder + resetColorCode);

        //Ex6
        double fahrenheit = 68;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(blueColorCode + fahrenheit + resetColorCode + " degrees Fahrenheit is equal to " + pinkColorCode + celsius + resetColorCode + " degrees Celsius.");

        //Ex7
        double inches = 100;
        double meters = convertInchesToMeters(inches);
        System.out.println(blueColorCode + inches + resetColorCode + " inches is equal to " + pinkColorCode + meters + resetColorCode + " meters.");

        //Ex8
        double distanceInMeters = 222000;
        int hours = 3;
        int minutes = 10;
        int seconds = 30;

        calculateAndDisplayVelocity(distanceInMeters, hours, minutes, seconds);

        //Ex9
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.printf("Circumference of the circle with radius " + blueColorCode + "%.5f" + resetColorCode + " is: " + pinkColorCode + "%.5f\n" + resetColorCode, radius, circumference);
        System.out.printf("Area of the circle with radius " + blueColorCode + "%.5f" + resetColorCode + " is: " + pinkColorCode + "%.5f " + resetColorCode, radius, area);

        scanner.close();
    }

    //Ex1
    public static void printMyName(){
        // ANSI escape code for blue text
        String blueColorCode = "\u001B[34m";
        // ANSI escape code to reset text color to default
        String resetColorCode = "\u001B[0m";
        System.out.println(blueColorCode + "Hello, \nTabitha!" + resetColorCode);
    }

    public static void printSum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter an integer: ");
        int int1 = scan.nextInt();
        System.out.println("Enter another integer: ");
        int int2 = scan.nextInt();
        int sum = int1 + int2;
        System.out.printf("%d + %d = %d", int1, int2, sum);
    }

    public static void printDivision(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the numerator:");
        double numerator = scan.nextInt();
        System.out.println("Enter the denominator:");
        double denominator = scan.nextInt();
        double divisionResult  = (double) numerator/denominator;
        System.out.printf("%.5f / %.5f = %.5f\n\n", numerator, denominator, divisionResult );
    }

    public static void printOperations(){
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

    //Ex2
    public static double sum(double first, double second){
        double result = first + second;
        return result;
    }

    public static double subtraction(double first, double second){
        double result = first - second;
        return result;
    }

    public static double multiplication(double first, double second){
        double result = first * second;
        return result;
    }

    public static double division(double first, double second){
        double result = first/second;
        return result;
    }

    //Ex3
    public static void printRobot(){
        System.out.println(" +\"\"\"\"\"+ \n" +
                "[| o o |]\n" +
                " |  ^  | \n" +
                " | '-' | \n" +
                " +-----+");
    }

    //Ex4
    public static double calculateArithmeticMean(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    //Ex5
    public static int calculateDivisionRemainder(int a, int b) {
        return a % b;
    }

    //Ex6
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        return celsius;
    }

    //Ex7
    public static double convertInchesToMeters(double inches) {
        double meters = inches * 0.0254;
        return meters;
    }

    //Ex8
    public static void calculateAndDisplayVelocity(double distanceInMeters, int hours, int minutes, int seconds) {
        // ANSI escape code for pink text
        String pinkColorCode = "\u001B[35m";
        // ANSI escape code for blue text
        String blueColorCode = "\u001B[34m";
        // ANSI escape code to reset text color to default
        String resetColorCode = "\u001B[0m";

        double totalSeconds = hours * 3600 + minutes * 60 + seconds;
        double velocityInMetersPerSecond = distanceInMeters / totalSeconds;
        double velocityInKilometersPerHour = (distanceInMeters / 1000) / (totalSeconds / 3600);
        double velocityInMilesPerHour = (distanceInMeters / 1609) / (totalSeconds / 3600);

        System.out.println("Velocity in meters per second: " + pinkColorCode + velocityInMetersPerSecond + blueColorCode + " m/s" + resetColorCode);
        System.out.println("Velocity in kilometers per hour: " + pinkColorCode + velocityInKilometersPerHour + blueColorCode + " km/h" + resetColorCode);
        System.out.println("Velocity in miles per hour: " + pinkColorCode + velocityInMilesPerHour + blueColorCode + " miles/h" + resetColorCode);
    }

    //Ex9
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}