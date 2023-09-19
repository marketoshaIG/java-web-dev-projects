package org.launchcode;

public class DVD extends BaseDisc {

    private int spinSpeed;

    public DVD(String name, int storageCapacity, int spinSpeed) {
        super(name, storageCapacity, "DVD");
        this.spinSpeed = spinSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + spinSpeed + " rpm.");
    }
}

