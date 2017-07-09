package BigNumber;


import java.util.*;


/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class BigInteger {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String s1,s2;
        s1=input.nextLine();
        s2=input.nextLine();
        input.close();
        System.out.println(new java.math.BigInteger(s1).add(new java.math.BigInteger(s2)));
        System.out.println(new java.math.BigInteger(s1).multiply(new java.math.BigInteger(s2)));
    }
}
