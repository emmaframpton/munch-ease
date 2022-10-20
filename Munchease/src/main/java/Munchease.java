import java.util.*;
import java.util.Scanner;

public class Munchease {
    public static void go(){
        boolean go = true;
        while(go) {
            Recipe cake = new Recipe("Cake", new String[]{"eggs", "butter"});
            Recipe cookies = new Recipe("Cookies", new String[]{"eggs", "butter"});
            Recipe pasta = new Recipe("Pasta", new String[]{"tomato sauce", "noodles"});
            Recipe ramen = new Recipe("Ramen", new String[]{"noodles"});
            Recipe lasagna = new Recipe("Lasagna", new String[]{"noodles", "cheese", "tomato sauce"});
            Recipe tacos = new Recipe("Tacos", new String[]{"tortillas", "cheese", "beef"});
            Recipe brownies = new Recipe("Brownies", new String[]{"eggs", "butter"});
            Recipe pizza = new Recipe("Pizza", new String[]{"cheese", "tomato sauce"});
            Recipe sandwich = new Recipe("Sandwich", new String[]{"bread", "cheese", "beef"});
            Recipe rice = new Recipe("Rice", new String[]{"rice"});
            Recipe[] recipesList = {cake, cookies, pasta, ramen, lasagna, tacos, brownies, pizza, sandwich, rice};
            Scanner scr = new Scanner(System.in);
            System.out.println("What page do you want to go to? Options:\nRecipes\nCalendar\nAdd Recipe\nGrocery List");
            String page = scr.nextLine();
            if (page.equals("Recipes")) {
                System.out.println("Recipes Page:\n");
                for (int i=0; i < recipesList.length; i++) {
                    Recipe.displayRecipe(recipesList[i]);
                }
            }
            else if (page.equals("Calendar")) {
                System.out.println("Calendar Page:\n");
                Calendar cal = new Calendar();
                cal.displayCalendar();
            }
            else if (page.equals("Add Recipe")) {
                System.out.println("Add Recipe Page:\n");
                AddRecipes adding = new AddRecipes();
                adding.addRecipeName("");
            }
            else if (page.equals("Grocery List")) {
                System.out.println("Grocery List Page:\n");
                GroceryList list = new GroceryList();
                list.printList();
            }
            Scanner scr3 = new Scanner(System.in);
            System.out.println("Do you want to go back to the main selection page?");
            String nextPage = scr3.nextLine();
            if (nextPage.equals("yes")) {
                go = true;
            }
            else{
                System.out.println("Have a great day!");
                go = false;
            }
        }
    }
    public static void main(String[] args) {
        go();
    }
}