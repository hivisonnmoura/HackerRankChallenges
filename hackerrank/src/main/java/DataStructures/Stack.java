package DataStructures;

import java.util.Scanner;

/**
 * Created by Hivison N Moura on 04/07/2017.
 */
public class Stack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());
        }

    }
}
