package com.pemrogramanlanjut;

// Muhammad Faruq (12250111791)

public class CobaTayo {
    public static void main(String[] args) {

        Tayo mobilTayo = new Tayo();

        mobilTayo.firstMethod("Tayo", "Biru", 6, 1234, "TIF");
        System.out.println();
        int totalRange = mobilTayo.secondMethod(60, 2);
        System.out.println("Total Jarak Tempuh  = " + totalRange + " KM/jam");
    }

}
