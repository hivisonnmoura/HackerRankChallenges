package Other;
import java.util.Arrays;

/**
 * Created by hivisonmoura on 2017-06-29.
 */
public class findNumber {

    static String findNumber(int[] arr, int k) {
        boolean found = Arrays.stream(arr).anyMatch(x -> k == x);
        String result;
        if (found) {
            result = "YES";
        } else {
            result = "NO";
        }

        return result;
    }
}

