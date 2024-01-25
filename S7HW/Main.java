package S7HW;

import S7HW.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result1 = calculator.calculate("add", 5.0, 3.0);
        double result2 = calculator.calculate("multiply", 4.0, 2.5);
        double result3 = calculator.calculate("divide", 10.0, 2.0);
    }
}