package Tutorial30Days;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by hivisonmoura on 2017-06-30.
 */
public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int nFactorial = scanner.nextInt();
            System.out.println(getFactorial(nFactorial));

        }finally {
            scanner.close();
        }



    }
    private static int getFactorial(int nFactorial){

       /*
       Java 7

        int fact =1;
        for(int i = 1 ; i <= nFactorial; i++){
            fact *= i;

        }
        return fact;
        */

        //Java 8
        return IntStream.rangeClosed(1,nFactorial).reduce(1, (x, y)->x * y);


    }
}
