package tpe.exceptions.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Ein simples Zahlenraten-Spiel.
 */
public final class Zahlenraten {

    /**
     * Liest einen String von der Tastatur.
     *
     * @return der gelesene String
     * @throws IOException Probleme mit der Console
     */
    private static String readNumber() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String input = br.readLine();
        return input;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     * @throws IOException I/O-Fehler
     */
    public static void main(String[] args) throws IOException {

        // zu ratende Zahl bestimmen
        int zahl = new Random().nextInt(100) + 1;

        int versuche = 0;

        while (true) {
            String read = "";
            try {
                System.out.print("Bitte geben Sie eine Zahl ein: ");
                read = readNumber();
                int geraten = Integer.parseInt(read);
                versuche++;

                if (geraten < zahl) {
                    System.out.println("Zu niedrig\n");
                }
                else if (geraten > zahl) {
                    System.out.println("Zu hoch.");
                }
                else {
                    System.out.printf("Richtig in %d Versuchen", versuche);
                    break;
                }
            }
            catch (NumberFormatException ex) {
                System.err.println("bitte korrekte Zahl eingeben");
                System.out.println();
            }
        }
    }
}
