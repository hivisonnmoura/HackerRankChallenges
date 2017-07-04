package String;

import java.util.Scanner;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class Substring{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
