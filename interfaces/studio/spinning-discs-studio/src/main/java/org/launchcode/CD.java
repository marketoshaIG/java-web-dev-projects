package org.launchcode;

public class CD extends BaseDisc {

    private int spinSpeed;

    public CD(String name, int storageCapacity, int spinSpeed) {
        super(name, storageCapacity, "CD");
        this.spinSpeed = spinSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + spinSpeed + " rpm.");
    }
}

