package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {

    private final String name;
    private final int storageCapacity;
    private final String contents;
    private final String discType;



    public BaseDisc(String name, int storageCapacity, String discType) {
//        if (storageCapacity <= 0) {
//            throw new IllegalArgumentException("Capacity must be greater than 0");
//        }
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = "";
        this.discType = discType;
    }

    @Override
    public void spinDisc() {
        // TODO: Implement specific code for spinning the disc.
        //throw new UnsupportedOperationException("spinDisc not implemented");
        //  }
    }

    @Override
    public void readDisc() {
        // TODO: Implement specific code for reading the disc.
    }

    @Override
    public void writeDisc(String data) {
        // TODO: Implement specific code for writing data to the disc.
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String getContents() {
        return contents;
    }

    @Override
    public String getDiscType() {
        return discType;
    }
}

