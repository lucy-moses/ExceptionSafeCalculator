/**
 * Performs addition operation
 */
package operations;

public class AddOperation implements Operation {
    @Override
    public double calculate(double... operands) {
        if (operands.length != 2) {
            throw new IllegalArgumentException("Addition requires exactly 2 operands");
        }
        return operands[0] + operands[1];
    }
}