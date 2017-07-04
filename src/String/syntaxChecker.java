package String;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class syntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            testCases--;
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
        }
    }
}
