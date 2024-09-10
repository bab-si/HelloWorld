package de.example.helloWorld;

public class Typecast {

    public static void main(String[] args) {

        short a = 5;
        int b = 14;

        // Implizite Typumwandlung von short zu int
        int result1 = a + b;
        System.out.println("Ergebnis mit impliziter Umwandlung: " + result1);

        // Explizite Typumwandlung von int zu short
        short result2 = (short) (a + b);
        System.out.println("Ergebnis mit expliziter Umwandlung: " + result2);
    }

}
