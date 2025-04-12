/**
 * Performs square root operation
 */
package operations;

public class SquareRootOperation implements Operation {
    @Override
    public double calculate(double... operands) throws IllegalArgumentException {
        if (operands.length != 1) {
            throw new IllegalArgumentException("Square root requires exactly 1 operand");
        }
        if (operands[0] < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(operands[0]);
    }
}