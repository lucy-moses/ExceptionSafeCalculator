/**
 * Performs division operation
 */
package operations;

public class DivideOperation implements Operation {
    @Override
    public double calculate(double... operands) throws ArithmeticException {
        if (operands.length != 2) {
            throw new IllegalArgumentException("Division requires exactly 2 operands");
        }
        if (operands[1] == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return operands[0] / operands[1];
    }
}