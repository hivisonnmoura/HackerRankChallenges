package Introduction;

import java.util.Scanner;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class End_Of_File {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while(sc.hasNext())
            System.out.println(++line_num + " " + sc.nextLine());
        sc.close();


    }
}
