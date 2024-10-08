package de.example.helloWorld;

public class HelloWorldWithComments {
    /**
     * Die Hauptmethode, die das Programm ausführt.
     *
     * @param args Die Befehlszeilenargumente (werden in diesem Programm nicht verwendet).
     */
    public static void main(String[] args) {
        // Gibt "Hello World" mit einem Zeilenumbruch dazwischen aus.
        System.out.println("Hello \nWorld");

        // Gibt einen Dateipfad aus.
        System.out.println("C:\\programmierung\\java");


        // Gibt das einfache Anführungszeichen auf der Konsole aus.
        System.out.println('\'');

        /*
         * Gibt einen String mit doppelten Anführungszeichen aus.
         * Demonstriert, wie man doppelte Anführungszeichen in einem String escapen kann.
         */
        System.out.println("Sie sagte: \"Java ist super\"");
    }
}