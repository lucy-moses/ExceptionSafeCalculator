/**
 * Performs square operation
 */
package operations;

public class SquareOperation implements Operation {
    @Override
    public double calculate(double... operands) {
        if (operands.length != 1) {
            throw new IllegalArgumentException("Square operation requires exactly 1 operand");
        }
        return operands[0] * operands[0];
    }
}