/**
 * Performs multiplication operation
 */
package operations;

public class MultiplyOperation implements Operation {
    @Override
    public double calculate(double... operands) {
        if (operands.length != 2) {
            throw new IllegalArgumentException("Multiplication requires exactly 2 operands");
        }
        return operands[0] * operands[1];
    }
}