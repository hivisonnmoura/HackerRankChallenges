package Tutorial30Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hivisonmoura on 2017-06-29.
 */
public class DictonaryPracticeChallenger {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        Map<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

                phoneBook.put(name, phone);


        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.get(s) != null){
                System.out.println(s+ "=" +phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }



        }
        in.close();
    }
}



