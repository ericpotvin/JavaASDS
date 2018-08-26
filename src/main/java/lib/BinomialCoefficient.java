package lib;

/**
 * Space and time efficient Binomial Coefficient
 *
 * We have discussed a O(n*k) time and O(k) extra space algorithm in this post.
 * The value of C(n, k) can be calculated in O(k) time and O(1) extra space.
 *
 * <pre>
 * C(n, k) = n! / (n-k)! * k!
 *         = [n * (n-1) *....* 1]  / [ ( (n-k) * (n-k-1) * .... * 1) *
 *                                     ( k * (k-1) * .... * 1 ) ]
 * After simplifying, we get
 * C(n, k) = [n * (n-1) * .... * (n-k+1)] / [k * (k-1) * .... * 1]
 *
 * Also, C(n, k) = C(n, n-k)  // we can change r to n-r if r > n-r
 * </pre>
 *
 * @link https://en.wikipedia.org/wiki/Binomial_coefficient
 */
public class BinomialCoefficient {

    /**
     * Get the value of Binomial Coefficient C(n, k)
     * @param n The n Coefficient
     * @param k The k Coefficient
     * @return int
     */
    // Returns
    public static int compute(int n, int k) {
        int res = 1;

        // Since C(n, k) = C(n, n-k)
        if ( k > n - k )
            k = n - k;

        // Calculate value of [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }
}
