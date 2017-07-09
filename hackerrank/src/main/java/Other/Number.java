package Other;
import java.util.Scanner;

/**
 * Created by hivisonmoura on 2017-06-29.
 */
public class Number {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        if(scanner.hasNextInt())
            value = scanner.nextInt();


        for (int i = 0; i <=10; i++){
            System.out.println(value + " X "+ i + " = " + value*i);
        }
        scanner.close();

    }
}
