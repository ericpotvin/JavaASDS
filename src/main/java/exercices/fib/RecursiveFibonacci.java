package exercices.fib;

/**
 * Linear Fibonacci iterative implementation
 *
 * Complexity: O(2^n)
 *
 */
public class RecursiveFibonacci {

    /**
     * Fibonacci
     * @param number The number
     * @return BigInteger
     */
    public static long fib(long number) {
        if (number <= 1) {
            return number;
        }
        return fib(number - 1) + fib(number - 2);
    }
}
