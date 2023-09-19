package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // Sort flavors alphabetically by name
        flavors.sort(new FlavorComparator());

        // Sort cones by increasing cost
        cones.sort(new ConeComparator());

        // Print sorted lists
        System.out.println("Flavors:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        System.out.println("\nCones:");
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

    }

}

class FlavorComparator implements Comparator<Flavor> {

    public int compare(Flavor f1, Flavor f2) {
        return f1.getName().compareTo(f2.getName());
    }

}

class ConeComparator implements Comparator<Cone> {
    ConeComparator comparator = new ConeComparator();
    cones.sort(comparator);
    }