package Other;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by hivisonmoura on 2017-06-29.
 */
public class oddNumber {


    static int[] oddNumbers(int l, int r) {

        int[] range = IntStream.rangeClosed(l, r).toArray();
        int[] oddrange = Arrays.stream(range).filter(n -> n % 2 != 0).toArray();


        return oddrange;
    }


    public static void main(String[] args) {
        int[] array = oddNumbers(2,9);
        for(int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);

        }
    }
}


