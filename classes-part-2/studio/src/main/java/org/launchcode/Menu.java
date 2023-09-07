package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private List<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}