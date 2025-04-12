/**
 * Performs subtraction operation
 */
package operations;

public class SubtractOperation implements Operation {
    @Override
    public double calculate(double... operands) {
        if (operands.length != 2) {
            throw new IllegalArgumentException("Subtraction requires exactly 2 operands");
        }
        return operands[0] - operands[1];
    }
}
