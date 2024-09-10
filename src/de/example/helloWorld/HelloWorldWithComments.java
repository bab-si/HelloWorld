package de.example.helloWorld;

public class HelloWorldWithComments {
    /**
     * Die Hauptmethode, die das Programm ausführt.
     *
     * @param args Die Befehlszeilenargumente (werden in diesem Programm nicht verwendet).
     */
    public static void main(String[] args) {
        // Gibt "Hello World" mit einem Zeilenumbruch dazwischen aus.
        System.out.println("Hello \n World");

        // Gibt einen Dateipfad aus.
        System.out.println("C:\\programmierung\\java");

        // Deklariert und initialisiert ein char mit einem einfachen Anführungszeichen.
        char singleQuoteFirst = '\'';

        // Gibt das einfache Anführungszeichen auf der Konsole aus.
        System.out.println("Das ist ein einfaches Anführungszeichen als Zeichen: " + singleQuoteFirst);

        /*
         * Gibt einen String mit doppelten Anführungszeichen aus.
         * Demonstriert, wie man doppelte Anführungszeichen in einem String escapen kann.
         */
        System.out.println("Sie sagte: \"Java ist super\"");
    }
}
