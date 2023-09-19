package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // Declare and initialize a CD and a DVD object.
        CD myCd = new CD("My CD", 700, 500);
        DVD myDvd = new DVD("My DVD", 4700, 1600);

        // Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myCd.readDisc();
        myCd.writeDisc("This is some data to write to the CD.");
//        System.out.println(myCd.getName());
//        System.out.println(myCd.getStorageCapacity());
//        System.out.println(myCd.getContents());
//        System.out.println(myCd.getDiscType());

        myDvd.spinDisc();
        myDvd.readDisc();
        myDvd.writeDisc("This is some data to write to the DVD.");
//         System.out.println(myDvd.getName());
//        System.out.println(myDvd.getStorageCapacity());
//       System.out.println(myDvd.getContents());
//        System.out.println(myDvd.getDiscType());
    }
}
