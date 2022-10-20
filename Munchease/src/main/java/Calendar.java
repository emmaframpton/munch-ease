import java.util.*;

public class Calendar {
    public void displayCalendar() {
        AddRecipes add = new AddRecipes();
        System.out.println("S: ");
        add.getSundayRecipes();
        AddRecipes add1 = new AddRecipes();
        System.out.println("M: ");
        add1.getMondayRecipes();
        System.out.println("T: ");
        AddRecipes add2 = new AddRecipes();
        add2.getTuesdayRecipes();
        System.out.println("W: ");
        AddRecipes add3 = new AddRecipes();
        add3.getWednesdayRecipes();
        System.out.println("R: ");
        AddRecipes add4 = new AddRecipes();
        add4.getThursdayRecipes();
        System.out.println("F: ");
        AddRecipes add5 = new AddRecipes();
        add5.getFridayRecipes();
        System.out.println("S: ");
        AddRecipes add6 = new AddRecipes();
        add6.getSaturdayRecipes();
    }

    public static void main(String[] args) {
    }

}

