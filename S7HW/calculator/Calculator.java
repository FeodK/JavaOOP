package S7HW.calculator;

import java.util.HashMap;
import java.util.Map;

import S7HW.calculator.operation.Addition;
import S7HW.calculator.operation.Division;
import S7HW.calculator.operation.Multiplication;
import S7HW.calculator.operation.Operation;

public class Calculator {
    private Map<String, Operation> operations;

    public Calculator() {
        operations = new HashMap<>();
        operations.put("add", new Addition());
        operations.put("multiply", new Multiplication());
        operations.put("divide", new Division());
    }

    public double calculate(String operation, double operand1, double operand2) {
        if (!operations.containsKey(operation)) {
            throw new IllegalArgumentException("Unsupported operation");
        }

        Operation op = operations.get(operation);
        double result = op.create(operand1, operand2);

        // Логирование
        System.out.println(String.format("%.1f %s %.1f = %.1f", operand1, operation, operand2, result));

        return result;
    }
}