package S7HW.calculator.operation;

public class Multiplication implements Operation {
    @Override
    public double create(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
