package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        }
        catch(InputMismatchException e) {
            // ensure that "java.util.InputMismatchException" is printed only.
            System.out.println(e.getClass().toString().replaceFirst("class ", ""));
        }
        catch(ArithmeticException e) {
            // Print exception
            System.out.println(e);
        }
        scan.close();
    }
}
