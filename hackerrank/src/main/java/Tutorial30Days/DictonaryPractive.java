package Tutorial30Days;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hivisonmoura on 2017-06-29.
 */
public class DictonaryPractive {
    public static void main(String[] args) {
        Map<String, String> englSpanDictonary = new HashMap<>();
        englSpanDictonary.put("Monday", "Lunes");
        englSpanDictonary.put("Tuesday", "Martes");
        englSpanDictonary.put("Wednesday", "Miércoles");
        englSpanDictonary.put("Thursday", "Jueves");
        englSpanDictonary.put("Friday", "Viernes");
        englSpanDictonary.put("Saturday", "Sábado");
        englSpanDictonary.put("Sunday", "Domingo");

        System.out.println(englSpanDictonary.get("Monday"));
        System.out.println(englSpanDictonary.get("Tuesday"));
        System.out.println(englSpanDictonary.get("Wednesday"));
        System.out.println(englSpanDictonary.get("Thursday"));
        System.out.println(englSpanDictonary.get("Friday"));
        //Print out all keys
        System.out.println(englSpanDictonary.keySet());

        System.out.println(englSpanDictonary.values());

        System.out.println(englSpanDictonary.size());

        System.out.println();

        //Shopping list
        Map<String, Boolean> shoppingList = new HashMap<>();
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreos", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", false);

        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.get("Oreos"));

        System.out.println(shoppingList.toString());

       
       shoppingList.remove("Eggs");
       
       shoppingList.replace("Bread", false);

       System.out.println(shoppingList.toString());

        shoppingList.clear();

        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());












    }
}
