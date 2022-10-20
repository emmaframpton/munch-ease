import java.util.Scanner;
import java.util.ArrayList;

public class AddRecipes {
    public static String sundayRecipes ="";
    public static String mondayRecipes ="";
    public static String tuesdayRecipes ="";
    public static String wednesdayRecipes ="";
    public static String thursdayRecipes ="";
    public static String fridayRecipes ="";
    public static String saturdayRecipes ="";

    public void addRecipeName(String name) {
        System.out.println("What recipe would you like to add?");
        Scanner scr1 = new Scanner(System.in);
        String addedRecipe = scr1.nextLine();
        System.out.println("What day would you like to add the recipe to?");
        Scanner scr2 = new Scanner(System.in);
        String day = scr2.nextLine();

        if (day.equals("Sunday")){
            this.sundayRecipes += addedRecipe;
        }
        if (day.equals("Monday")){
            this.mondayRecipes += addedRecipe;
        }
        if (day.equals("Tuesday")){
            this.tuesdayRecipes += addedRecipe;
        }
        if (day.equals("Wednesday")){
            this.wednesdayRecipes += addedRecipe;
        }
        if (day.equals("Thursday")){
            this.thursdayRecipes += addedRecipe;
        }
        if (day.equals("Friday")){
            this.fridayRecipes += addedRecipe;
        }
        if (day.equals("Saturday")){
            this.saturdayRecipes += addedRecipe;
        }
    }

    public static void getSundayRecipes() {
        System.out.println(sundayRecipes);
    }

    public static void getMondayRecipes() { System.out.println(mondayRecipes); }

    public static void getTuesdayRecipes() {
        System.out.println(tuesdayRecipes);
    }

    public static void getWednesdayRecipes() {
        System.out.println(wednesdayRecipes);
    }

    public static void getThursdayRecipes() {
        System.out.println(thursdayRecipes);
    }

    public static void getFridayRecipes() {
        System.out.println(fridayRecipes);
    }

    public static void getSaturdayRecipes() {
        System.out.println(saturdayRecipes);
    }

}
