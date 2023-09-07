package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem pizzaItem = new MenuItem(10, "Pizza", "Main Course", false);
        MenuItem saladItem = new MenuItem(7.5, "Salad", "Appetizer", false);
        menu.addItem(pizzaItem);
        menu.addItem(saladItem);

        System.out.println("Menu Items:");
        for (MenuItem item : menu.getItems()) {
            System.out.println("Name: " + item.getDescription());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Is New: " + item.isNew());
            System.out.println();
        }
    }
}