import java.util.ArrayList;

public class Recipe {
    private String name;
    private String[] ingredients;
    public Recipe(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
    public static void displayRecipe(Recipe recipe) {
        String ingredientsStr = recipe.ingredients.toString();
        System.out.println(recipe.name + recipe.ingredients.toString());
    }

    @Override
    public String toString() {
        String ingredientsStr = "";
        for(int i = 0; i < this.ingredients.length; i++) {
            System.out.println("HELLO");
        }
        return ingredientsStr;
    }
}
