public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String compareToEvozon(String string){
        if(string.equals("Evozon")){
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String compareStringAndNumber(String string, int number){
        if(string.equals("Evozon") && number <= 3){
            return string + " + " + number;
        } else if (!string.equals("Evozon") && number >= 4) {
            return number + " " + string;
        } else {
            return "Invalid input";
        }
    }

    public String snowForecast(int snowAmount){
        if(snowAmount >= 8 || snowAmount == 6){
            return "The amount of snow this winter was(cm): " + snowAmount;
        } else {
            return "The forecast snow is(cm): " + snowAmount;
        }
    }

    public String checkNumber(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }

    public void displayNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 1!");
                break;
            case 5:
                System.out.println("The number is: 2!");
                break;
            case 6:
                System.out.println("The number is: 3!");
                break;
            case 7:
                System.out.println("The number is: 3!");
                break;
            case 8:
                System.out.println("The number is: 1!");
                break;
            case 9:
                System.out.println("The number is: 2!");
                break;
            case 10:
                System.out.println("The number is: 3!");
                break;
            default:
                System.out.println("The number is not: 1, 2, 3, 4, 5, 6, 7, 8, 9 or 10!");
                break;
        }
    }

    public boolean isNumberEven(int number){
        return number % 2 == 0;
    }

    public boolean isEligibleToVote(int age) {
        return age > 18;
    }

    public int findMaxNumber(int num1, int num2, int num3){
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public void printCountdownTo100(int number) {
        if (number <= 100){
            System.out.printf("Numbers between %d and %d: ", number, 100);
            for (int i = number; i <= 100; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        } else {
            System.out.printf("Numbers between %d and %d: ", 100, number);
            for (int i = number; i >= 100; i--) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    public void printCountdownToNegative100(int number) {
        if (number <= -100){
            System.out.printf("Numbers between %d and %d: ", number, -100);
            for (int i = number; i <= -100; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        } else {
            System.out.printf("Numbers between %d and %d: ", -100, number);
            for (int i = number; i >= -100; i--) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    public void printCountdownBetweenNumbers(int x, int y) {
        if (x <= y) {
            System.out.printf("Numbers between %d and %d: ", x, y);
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        } else {
            System.out.printf("Numbers between %d and %d: ", x, y);
            for (int i = x; i >= y; i--) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    public void countUpBetweenNumbers(int x, int y) {
        if (x < y) {
            System.out.printf("Numbers between %d and %d: ", x, y);
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        } else {
            System.out.printf("Numbers between %d and %d: ", y, x);
            for (int i = y; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    public void printEvenNumbers() {
        System.out.printf("Even numbers from 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    public void printOddNumbers() {
        System.out.printf("Odd numbers from 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    public int sumNumbersUpTo100(int number){
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public double calculateAverageUpTo100(int number) {
        int sum = 0;
        int count = 0;

        for (int i = number; i <= 100; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;
        return average;
    }

    public void printPattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
