import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        System.out.println(pinkColorCode + "Assignment Lists loops" + resetColorCode);
        System.out.println();

        //Ex1
        List<Integer> myList = List.of(1, 2, 3, 4, 5);
        logicalOp.printListValues(myList);
        System.out.println();

        //Ex2
        List<Integer> myList2 = new ArrayList<>();

        myList2.add(1);
        myList2.add(2);
        myList2.add(3);
        int numberToAdd = 4;

        logicalOp.addNumberToList(myList2, numberToAdd);

        System.out.println("List after adding the number " + numberToAdd + ": " + myList2);
        System.out.println();

        //Ex3
        int startingIndex = 2;
        System.out.println("List values starting from index " + startingIndex + ": ");
        logicalOp.printListValuesFromIndex(myList, startingIndex);
        System.out.println();

        //Ex4
        System.out.println("List values in reverse: ");
        logicalOp.printListValuesInReverse(myList);
        System.out.println();

        //Ex5
        List<String> myList5 = new ArrayList<>();

        myList5.add("A");
        myList5.add("B");
        myList5.add("C");

        String stringToAdd = "X";

        int positionToAdd = 1;

        logicalOp.addStringToListAtPosition(myList5, positionToAdd, stringToAdd);

        System.out.println("List after adding the string \"" + stringToAdd + "\" at position " + positionToAdd + ": " + myList5);

        //Ex6
        List<Integer> myList6 = new ArrayList<>();

        myList6.add(2);
        myList6.add(3);
        myList6.add(4);

        int numberToAdd6 = 1;

        logicalOp.addElementAtFirstPosition(myList6, numberToAdd6);
        System.out.println("List after adding the number " + numberToAdd6 + " at the first position: " + myList6);
        System.out.println();

        //Ex7
        List<Integer> myList7 = List.of(4, 2, 6, 1, 3);
        logicalOp.printListValuesWithPositions(myList7);

        System.out.println();

        //Ex8
        List<Integer> myList8 = List.of(4, 7, 2, 9, 5);
        int maxNumber8 = logicalOp.findMaxNumber(myList8);
        System.out.println("The largest number in the list is: " + maxNumber8);
        System.out.println();



        System.out.println(pinkColorCode + "Assignment Arrays loops" + resetColorCode);

        int result1 = calculator.add(10, 20);
        float result2 = calculator.add(5.5f, 3.3f);
        float result3 = calculator.add(1.2f, 2.3f, 3.4f);
        int result4 = calculator.add(1, 2, 3, 4);
        double result5 = calculator.add(2.5, 3.7);

        System.out.println("Addition");
        System.out.println("10 + 20 = " + result1);
        System.out.println("5.5 + 3.3 = " + result2);
        System.out.println("1.2 + 2.3 + 3.4 = " + result3);
        System.out.println("1 + 2 + 3 + 4 = " + result4);
        System.out.println("2.5 + 3.7 = " + result5);
        System.out.println();

        // Test subtraction methods with different parameter types
        int res1 = calculator.subtraction(10, 5);
        float res2 = calculator.subtraction(5.5f, 2.2f);
        double res3 = calculator.subtraction(7.8, 3.6);

        // Test subtraction methods with different number of parameters
        int res4 = calculator.subtraction(20, 5, 3);
        float res5 = calculator.subtraction(10.5f, 2.5f, 11.5f);
        double res6 = calculator.subtraction(15.7, 4.2, 2.1);

        System.out.println("Subtraction");
        System.out.println("10 - 5 = " + res1);
        System.out.println("5.5 - 2.2 = " + res2);
        System.out.println("7.8 - 3.6 = " + res3);
        System.out.println("20 - 5 - 3 = " + res4);
        System.out.println("10.5 - 2.5 - 11.5 = " + res5);
        System.out.println("15.7 - 4.2 - 2.1 = " + res6);
        System.out.println();

        System.out.println("Multiplication");
        // Test multiply methods with two parameters
        double m1 = calculator.multiply(2.5, 3.0);
        int m2 = calculator.multiply(5, 4);
        float m3 = calculator.multiply(1.5f, 2.0f);

        // Test multiply methods with three parameters
        double m4 = calculator.multiply(2.5, 3.0, 1.5);
        int m5 = calculator.multiply(5, 4, 2);
        float m6 = calculator.multiply(1.5f, 2.0f, 0.5f);

        System.out.println("Result1: " + m1);
        System.out.println("Result2: " + m2);
        System.out.println("Result3: " + m3);
        System.out.println("Result4: " + m4);
        System.out.println("Result5: " + m5);
        System.out.println("Result6: " + m6);
        System.out.println();

        System.out.println("Division");
        // Test divide methods with two parameters
        double d7 = calculator.divide(10.0, 2.0);
        int d8 = calculator.divide(20, 4);
        float d9 = calculator.divide(8.0f, 2.0f);

        // Test divide methods with three parameters
        double d10 = calculator.divide(15.0, 2.0, 3.0);
        int d11 = calculator.divide(100, 5, 2);
        float d12 = calculator.divide(6.0f, 2.0f, 1.5f);

        System.out.println("Result7: " + d7);
        System.out.println("Result8: " + d8);
        System.out.println("Result9: " + d9);
        System.out.println("Result10: " + d10);
        System.out.println("Result11: " + d11);
        System.out.println("Result12: " + d12);
        System.out.println();

        //Ex2
        logicalOp.writeTo100Array();

        //Ex3
        int[] myArray = new int[50]; // Create an empty integer array of size 50

        myArray = logicalOp.populateEvenNumbersArray(myArray);

        // Print the populated array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");

        //Ex4
        int[] myArray2 = {10, 20, 30, 40, 50}; // Create an array with some numbers
        double averageArray = logicalOp.calculateAverage(myArray2);
        System.out.println("The average of the numbers is: " + averageArray);
        System.out.println();

        //Ex5
        String[] myArray3 = {"apple", "banana", "orange", "grape", "kiwi"};
        String searchString = "orange";

        boolean found = logicalOp.checkStringInArray(myArray3, searchString);
        System.out.println("Is the string '" + searchString + "' present in the array? \n" + found);
        System.out.println();

        //Ex6
        int[] myArray4 = {10, 20, 30, 40, 50};
        int numberToFind = 30;

        int position = logicalOp.findNumberInArray(myArray4, numberToFind);
        if (position != -1) {
            System.out.println("Number " + numberToFind + " found at position " + position);
        } else {
            System.out.println("Number " + numberToFind + " not found in the array.");
        }
        System.out.println();

        //Ex7
        int rows = 10;
        int columns = 10;

        logicalOp.printGrid(rows, columns);
        System.out.println();

        //Ex8
        int numberToRemove = 40;
        int[] resultArray = logicalOp.removeNumberFromArray(myArray4, numberToRemove);
        logicalOp.printIntArray(myArray4);
        System.out.println("Array after removing " + numberToRemove + ": " + Arrays.toString(resultArray));

        //Ex9
        System.out.println("Second smallest number in the array: " + logicalOp.findSecondSmallest(myArray4));
        System.out.println();

        //Ex10
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        logicalOp.copyArray(sourceArray, destinationArray);
        System.out.println("Source array: " + Arrays.toString(sourceArray));
        System.out.println("Destination array (copied): " + Arrays.toString(destinationArray));
        System.out.println();



        System.out.println(pinkColorCode + "Assignment While loops" + resetColorCode);

        //Ex7
        logicalOp.sumAndAverageNumbersInInterval();

        //Ex8
        int startNumber8 = 100;
        int endNumber8 = 200;
        double averageDivisibleBy7 = logicalOp.averageOfNumbersDivisibleBy7(startNumber8, endNumber8);
        System.out.println("The average of numbers divisible by 7 from " + startNumber8 + " to " + endNumber8 + " is: " + averageDivisibleBy7);

        System.out.println();

        //Ex9
        logicalOp.printFirst20FibonacciNumbers();
        System.out.println();

        //Ex10
        logicalOp.cozaLozaWoza();




        System.out.println(pinkColorCode + "Assignment For loops" + resetColorCode);

        //Ex1
        int startNumber = 85;
        logicalOp.printCountdownTo100(startNumber);

        int startNumber2 = 112;
        logicalOp.printCountdownTo100(startNumber2);

        //Ex2
        int startNumber3 = 0;
        logicalOp.printCountdownToNegative100(startNumber3);

        int startNumber4 = -170;
        logicalOp.printCountdownToNegative100(startNumber4);

        //Ex3
        int a1 = 10, a2 = 5;
        logicalOp.printCountdownBetweenNumbers(a1, a2);

        a1 = 20; a2 = 47;
        logicalOp.printCountdownBetweenNumbers(a1, a2);

        //Ex4
        a1 = 5; a2 = 10;
        logicalOp.countUpBetweenNumbers(a1, a2);

        a1 = 23; a2 = 10;
        logicalOp.countUpBetweenNumbers(a1, a2);

        //Ex5
        logicalOp.printEvenNumbers();

        //Ex6
        logicalOp.printOddNumbers();

        //Ex7
        int b = 50;
        int result_b = logicalOp.sumNumbersUpTo100(b);
        System.out.println("The sum from " + b + " to 100 is: " + result_b);
        System.out.println();

        //Ex8
        int c = 50;
        double average = logicalOp.calculateAverageUpTo100(c);
        System.out.println("The average from " + startNumber + " to 100 is: " + average);
        System.out.println();

        //Ex9
        logicalOp.printPattern();

        System.out.println(pinkColorCode + "Assignment3" + resetColorCode);

        //Ex3
         int big1 = 2;
         int big2 = 3;
         int biggest = logicalOp.checkBiggerNumber(big1, big2);
        System.out.printf("The bigger number between %d and %d is: %d\n\n", big1, big2, biggest);

        //Ex4
        String input1 = "Evozon";
        String r1 = logicalOp.compareToEvozon(input1);
        System.out.printf("Evozon VS %s -> %s\n", input1, r1);

        String input2 = "EvOzOn"; // Different case
        String r2 = logicalOp.compareToEvozon(input2);
        System.out.printf("Evozon VS %s -> %s\n", input2, r2);

        String input3 = "OtherText";
        String r3 = logicalOp.compareToEvozon(input3);
        System.out.printf("Evozon VS %s -> %s\n\n", input3, r3);

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
        System.out.printf("%.5f + %.5f = %.5f\n", x, y, calculator.add(x,y));
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