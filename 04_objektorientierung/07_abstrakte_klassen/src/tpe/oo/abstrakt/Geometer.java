package tpe.oo.abstrakt;

/**
 * Flächenberechnung.
 */
public final class Geometer {

    /** Keine Instanzen. */
    private Geometer() {
        // keine Objekte
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        Figur[] fig = new Figur[10];


        fig[0] = new Dreieck(4.0, 3.0);
        fig[1] = new Dreieck(2.0, 1.0);
        fig[2] = new Dreieck(5.0, 8.0);
        fig[3] = new Dreieck(2.0, 7.2);
        fig[4] = new Dreieck(14.0, 3.8);
        fig[5] = new Kreis(10.0);
        fig[6] = new Kreis(5.5);
        fig[7] = new Kreis(3.3);
        fig[8] = new Kreis(7.2);
        fig[9] = new Kreis(8.0);

        double gesamtflaeche = 0.0;

        for (Figur figur : fig) {
            gesamtflaeche += figur.flaeche();
        }

        System.out.printf("Die Fläche beträgt: %.2f", gesamtflaeche);
    }
}
