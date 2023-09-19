package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone c1, Cone c2) {

        double cost1 = c1.getCost();
        double cost2 = c2.getCost();

        if (cost1 > cost2) {
            return 1;
        } else if (cost1 < cost2) {
            return -1;
        } else {
            return 0;
        }

    }
}
