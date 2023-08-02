public class Calculator {
    // Add methods
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public float add(float a, float b, float c) {
        return a + b + c;
    }

    public float add(float a, float b, float c, float d) {
        return a + b + c + d;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }


    // Subtraction methods
    public int subtraction(int a, int b) {
        return a - b;
    }

    public float subtraction(float a, float b) {
        return a - b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public int subtraction(int a, int b, int c) {
        return a - b - c;
    }

    public float subtraction(float a, float b, float c) {
        return a - b - c;
    }

    public double subtraction(double a, double b, double c) {
        return a - b -c;
    }

    // Multiply methods
    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Divide methods
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

    public double divide(double a, double b, double c) {
        if (b == 0 || c == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b / c;
    }

    public float divide(float a, float b, float c) {
        if (b == 0 || c == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b / c;
    }

    public int divide(int a, int b, int c) {
        if (b == 0 || c == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b / c;
    }
}
