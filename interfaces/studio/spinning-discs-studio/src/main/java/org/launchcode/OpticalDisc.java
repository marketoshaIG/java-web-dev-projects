package org.launchcode;

public interface OpticalDisc {

    void spinDisc();
    void readDisc();
    void writeDisc(String data);
    String getName();
    int getStorageCapacity();
    String getContents();
    String getDiscType();
}
