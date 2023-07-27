import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();

        // ANSI escape code for pink text
        String pinkColorCode = "\u001B[35m";
        // ANSI escape code for blue text
        String blueColorCode = "\u001B[34m";
        // ANSI escape code to reset text color to default
        String resetColorCode = "\u001B[0m";

        int big1 = 2;
        int big2 = 3;
        int biggest = logicalOp.checkBiggerNumber(big1, big2);

        System.out.println(pinkColorCode + "Assignment3" + resetColorCode);

        //Ex3
        System.out.printf("The bigger number between %d and %d is: %d\n\n", big1, big2, biggest);

        //Ex4
        String input1 = "Evozon";
        String result1 = logicalOp.compareToEvozon(input1);
        System.out.printf("Evozon VS %s -> %s\n", input1, result1);

        String input2 = "EvOzOn"; // Different case
        String result2 = logicalOp.compareToEvozon(input2);
        System.out.printf("Evozon VS %s -> %s\n", input2, result2);

        String input3 = "OtherText";
        String result3 = logicalOp.compareToEvozon(input3);
        System.out.printf("Evozon VS %s -> %s\n\n", input3, result3);

        //Ex5
        String input5_1 = "Evozon";
        int num5_1 = 3;
        String result5_1 = logicalOp.compareStringAndNumber(input5_1, num5_1);
        System.out.println("Result 1: " + result5_1);

        String input5_2 = "Evozon";
        int num5_2 = 5;
        String result5_2 = logicalOp.compareStringAndNumber(input5_2, num5_2);
        System.out.println("Result 2: " + result5_2);

        String input5_3 = "OtherText";
        int num5_3 = 2;
        String result5_3 = logicalOp.compareStringAndNumber(input5_3, num5_3);
        System.out.println("Result 3: " + result5_3);
        System.out.println();

        //Ex6
        int amount1 = 10;
        String result6_1 = logicalOp.snowForecast(amount1);
        System.out.println(result6_1);

        int amount2 = 6;
        String result6_2 = logicalOp.snowForecast(amount2);
        System.out.println(result6_2);

        int amount3 = 4;
        String result6_3 = logicalOp.snowForecast(amount3);
        System.out.println(result6_3);
        System.out.println();

        //Ex7
        int num7_1 = 5;
        String result7_1 = logicalOp.checkNumber(num7_1);
        System.out.println(num7_1 + ": " + result7_1);

        int num7_2 = 4;
        String result7_2 = logicalOp.checkNumber(num7_2);
        System.out.println(num7_2 + ": " + result7_2);

        int num7_3 = 2;
        String result7_3 = logicalOp.checkNumber(num7_3);
        System.out.println(num7_3 + ": " + result7_3);
        System.out.println();

        //Ex8
        int num8_1 = 1;
        logicalOp.displayNumber(num8_1);

        int num8_2 = 5;
        logicalOp.displayNumber(num8_2);

        int num8_3 = 12;
        logicalOp.displayNumber(num8_3);
        System.out.println();

        //Ex9
        int num9_1 = 10;
        int num9_2 = 15;

        boolean isEven1 = logicalOp.isNumberEven(num9_1);
        System.out.println(num9_1 + " is even: " + isEven1);

        boolean isEven2 = logicalOp.isNumberEven(num9_2);
        System.out.println(num9_2 + " is even: " + isEven2);
        System.out.println();

        //Ex10
        int age1 = 25;
        int age2 = 17;

        boolean isEligible1 = logicalOp.isEligibleToVote(age1);
        System.out.println("Age " + age1 + " is eligible to vote: " + isEligible1);

        boolean isEligible2 = logicalOp.isEligibleToVote(age2);
        System.out.println("Age " + age2 + " is eligible to vote: " + isEligible2);
        System.out.println();

        //Ex11
        int num10_1 = 15;
        int num10_2 = 8;
        int num10_3 = 20;

        int maxNumber = logicalOp.findMaxNumber(num10_1, num10_2, num10_3);
        System.out.println("The maximum number is: " + maxNumber);


        //Assignment2
        System.out.println(pinkColorCode + "\nAssignment2" + resetColorCode);

        //Ex1
//        printMyName();
//        printSum();
//        printDivision();
//        printOperations();

        //Ex2
        double x = 10;
        double y = 3;
        System.out.printf("%.5f + %.5f = %.5f\n", x, y, calculator.sum(x,y));
        System.out.printf("%.5f - %.5f = %.5f\n", x, y, calculator.subtraction(x,y));
        System.out.printf("%.5f * %.5f = %.5f\n", x, y, calculator.multiply(x,y));
        System.out.printf("%.5f / %.5f = %.5f\n", x, y, calculator.divide(x,y));
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