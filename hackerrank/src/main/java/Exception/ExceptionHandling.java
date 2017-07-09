package Exception;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class ExceptionHandling {
    public int power(final int n, final int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        int res = 1;
        for (int i = 0; i < p; i++) {
            res *= n;
        }
        return res;
    }
}
