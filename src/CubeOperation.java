/**
 * Performs cube operation
 */
package operations;

public class CubeOperation implements Operation {
    @Override
    public double calculate(double... operands) {
        if (operands.length != 1) {
            throw new IllegalArgumentException("Cube operation requires exactly 1 operand");
        }
        return operands[0] * operands[0] * operands[0];
    }
}