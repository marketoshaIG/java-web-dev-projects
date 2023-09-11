package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // write your code here
        //  ArrayList<MenuItem> menuItems = new ArrayList<>();
        Menu menu = new Menu(LocalDate.now(), new ArrayList<MenuItem>());

        menu.getItems().add(new MenuItem(10,"Pizza", "Main Course",false));
        menu.getItems().add(new MenuItem(5,"Fritters", "Appetizer",true));
        menu.getItems().add(new MenuItem(10,"Ice cream", "Dessert",true));
        menu.getItems().add(new MenuItem(10,"Veggies", "Appetizer",false));

        menu.addItems(new MenuItem(15,"Caramel Custard", "Dessert",true));
        menu.addItems(new MenuItem(10,"Burrito Bowl", "Dinner",true));

        System.out.println("\nItems in menu are:");
        for(MenuItem items : menu.getItems()) {
            System.out.println(items.getDescription());
        }

        menu.removeItems(new MenuItem(10,"Pizza", "Main Course",false));
        System.out.println("\nItems in menu are:");
        for(MenuItem items : menu.getItems()) {
            System.out.println(items.getDescription());
        }

        System.out.println("\nNew items in menu are:");
        for(MenuItem items : menu.getItems()) {
            if(items.getNew()) {
                System.out.println(items.getDescription());
            }
        }

        System.out.println("\nMenu last updates on :" + menu.getLastUpdated());
    }

}