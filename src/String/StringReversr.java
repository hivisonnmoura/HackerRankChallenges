package String;

import java.util.Scanner;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class StringReversr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String R = new StringBuilder(A).reverse().toString();

        if(A.equals(R)) System.out.println("Yes");
        else System.out.println("No");
    }
}
