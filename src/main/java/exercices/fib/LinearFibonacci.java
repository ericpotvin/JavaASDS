package exercices.fib;

/**
 * Linear Fibonacci iterative implementation
 *
 * Complexity: O(n)
 *
 */
public class LinearFibonacci {

    /**
     * Fibonacci
     * @param number The number
     * @return BigInteger
     */
    public static long fib(long number) {
      if (number <= 1) {
          return number;
      }
      long first = 0;
      long second = 1;
      for (long i = 2; i <= number; i++) {
        long result = first + second;
        first = second;
        second = result;
      }
      return second;
    }
}
