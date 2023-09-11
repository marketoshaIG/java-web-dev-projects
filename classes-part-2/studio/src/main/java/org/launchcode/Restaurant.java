package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;
public class Restaurant {
    public static void main(String[] args) {
        // Create a menu
        Menu menu = new Menu(LocalDate.now(), new ArrayList<MenuItem>());

        // Add items to the menu
        menu.addItems(new MenuItem(10, "Pizza", "Main Course", false));
        menu.addItems(new MenuItem(5, "Fritters", "Appetizer", true));
        menu.addItems(new MenuItem(10, "Ice cream", "Dessert", true));
        menu.addItems(new MenuItem(10, "Veggies", "Appetizer", false));

        // Print the entire menu
        System.out.println("\nItems in menu are:");
        for (MenuItem item : menu.getItems()) {
            System.out.println(item.getDescription());
        }

        // Print an individual menu item
        MenuItem menuItemToPrint = menu.getItems().get(0); // Choose an index
        System.out.println("\nIndividual menu item:");
        System.out.println("Description: " + menuItemToPrint.getDescription());
        System.out.println("Price: " + menuItemToPrint.getPrice());
        System.out.println("Category: " + menuItemToPrint.getCategory());
        System.out.println("Is New: " + menuItemToPrint.getNew());

        // Delete an item from the menu
        MenuItem itemToDelete = new MenuItem(10, "Pizza", "Main Course", false);
        menu.removeItems(itemToDelete);

        // Reprint the menu
        System.out.println("\nUpdated menu after deleting an item:");
        for (MenuItem item : menu.getItems()) {
            System.out.println(item.getDescription());
        }

        // Print new items in the menu
        System.out.println("\nNew items in menu are:");
        for (MenuItem item : menu.getItems()) {
            if (item.getNew()) {
                System.out.println(item.getDescription());
            }
        }

        // Print the last updated date of the menu
        System.out.println("\nMenu last updated on: " + menu.getLastUpdated());
    }
}

