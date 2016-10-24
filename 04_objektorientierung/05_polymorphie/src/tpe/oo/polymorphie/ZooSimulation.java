package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        ZooTier[] tier = new ZooTier[3];
        tier[0] = new Affe("Charlie");
        tier[1] = new Gorilla("Buck");
        tier[2] = new Giraffe("Debbie");


        System.out.println(tier[0]);
        System.out.println(tier[1]);
        System.out.println(tier[2]);

        System.out.println("Fütterung...");

        Futterstelle.gibFutter(tier);


        System.out.println(tier[0]);
        System.out.println(tier[1]);
        System.out.println(tier[2]);
    }

}
