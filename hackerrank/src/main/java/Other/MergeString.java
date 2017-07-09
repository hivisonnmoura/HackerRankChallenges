package Other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hivisonmoura on 2017-06-29.
 */
public class MergeString {

    public static void main(String[] args) {


        String asd ="asd";
        String dsa = "dsa";

        String[] a = asd.split("");
        String[] b = dsa.split("");




        String[] concat = new String[a.length + b.length];

        List<String> stringList = new ArrayList<>();

        for(int i =0 ; i <= concat.length; i++){
            if( i <= a.length-1){
                stringList.add(a[i]);

            }
            if(i <= a.length-1){
                stringList.add(b[i]);
            }
        }

        StringBuilder cvc = new StringBuilder();
        stringList.forEach(cvc::append);

        String str = cvc.toString();
        System.out.println(str);
    }

    static String mergeStrings(String a, String b) {

        String[] arrayStringA = a.split("");
        String[] arrayStringB = b.split("");
        List<String> stringList = new ArrayList<>();
        int arrayLenght = arrayStringA.length + arrayStringB.length;
        for(int i =0 ; i <= arrayLenght;  i++){
            if( i <= arrayStringA.length-1){
                stringList.add(arrayStringA[i]);
            }
            if(i <= arrayStringB.length-1){
                stringList.add(arrayStringB[i]);
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        stringList.forEach(stringBuilder::append);



        String mergedString = stringBuilder.toString();
        return mergedString;

    }

}
