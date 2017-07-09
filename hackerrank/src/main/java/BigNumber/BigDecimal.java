package BigNumber;

import java.util.Scanner;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class BigDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            java.math.BigDecimal max = new java.math.BigDecimal(s[i]);
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                {
                    java.math.BigDecimal curr = new java.math.BigDecimal(s[j]);
                    if (curr.compareTo(max) == 1) {
                        max = curr;
                        idx = j;
                    }
                }
                String temp = s[i];
                s[i] = s[idx];
                s[idx] = temp;
            }

            for (i = 0; i < n; i++) {
                System.out.println(s[i]);
            }


        }
    }
}
