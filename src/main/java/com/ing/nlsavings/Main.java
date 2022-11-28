package com.ing.nlsavings;

public class Main {

    private static String dealer1;
    private static String amsterdam;

    public static void main(String[] args) {
        addDealer ("vanMossel", "amsterdam","Tesla");
        addDealer( "Louwman","Utrecht","Ford");

    }

    private static void addDealer(String dealer1, String amsterdam, String ford) {
        Main.dealer1 = dealer1;
        Main.amsterdam = amsterdam;
    }
}
