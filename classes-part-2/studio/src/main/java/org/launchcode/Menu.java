package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItems(MenuItem menuItem){
        items.add(menuItem);
    }
    public void removeItems(MenuItem menuItem){
        items.remove(menuItem);
    }
    @Override
    public String toString() {
        return "*************\n" +  "Last updated: " + getLastUpdated() + "items on menu: " + getItems()

    }
}