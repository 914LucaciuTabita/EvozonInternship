public class Calculator {
    public double sum(double first, double second){
        return first + second;
    }

    public double subtraction(double first, double second){
        return first - second;
    }

    public double multiply(double first, double second){
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return first / second;
    }
}
