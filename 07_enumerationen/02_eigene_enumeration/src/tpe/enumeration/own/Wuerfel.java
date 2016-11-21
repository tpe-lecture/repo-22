package tpe.enumeration.own;
import java.util.Random;

/**
 * Würfel.
 *
 */
public class Wuerfel {
    int numSides;

    /**
     *
     * @return sides
     */
    public int getNumSides() {
        return numSides;
    }

    /**
     * Einen neuen Würfel anlegen.
     *
     * @param w Anzahl der Seiten des Würfels.
     */
    public Wuerfel(Wuerfeltyp w) {
        this.numSides = w.seitenFlaechen;
    }

    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    public int roll() {
        return rnd.nextInt(numSides) + 1;
    }
}
