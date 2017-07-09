package DataStructures;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class Java1dPart2 {
    public static boolean canWin(int leap, int[] game) {
        OptionalInt hasOne = Arrays.stream(game).filter(m -> m ==1).findAny();

        if (!hasOne.isPresent()){
            return true;
        } else if( (leap + 1) > (game.length -1)){
            return true;
        }

       return false;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
