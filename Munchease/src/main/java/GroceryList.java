import java.sql.Array;
import java.util.HashMap;
import java.util.*;
import java.util.ArrayList;


public class GroceryList {

    public void printList() {
        HashMap<String, Integer> costs = new HashMap<String, Integer>();
        costs.put("Egg", 4);
        costs.put("Flour", 7);
        costs.put("Milk", 3);
        costs.put("Sugar", 4);
        costs.put("Vanilla extract", 2);
        costs.put("Baking powder", 2);
        costs.put("Noodles", 3);
        costs.put("Tomato sauce", 4);
        costs.put("Cheese", 4);
        costs.put("Rice", 3);
        costs.put("Tortillas", 2);
        costs.put("Beef", 7);
        costs.put("Bread", 4);
        System.out.println(costs);
    }
}
