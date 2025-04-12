/**
 * Interface for all calculator operations
 */
package operations;

public interface Operation {
    double calculate(double... operands) throws ArithmeticException, IllegalArgumentException;
}