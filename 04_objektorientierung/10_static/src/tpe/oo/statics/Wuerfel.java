package tpe.oo.statics;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

    /** Häufigkeit der Werte. */
    private static int[] haeufigkeit = new int[6];

    /** Zufallsgenerator. */
    private static Random random = new Random();

    /**
     * Bestimmt den nächsten Wurf.
     *
     * @return der Wurf.
     */
    public static int wuerfele() {
        int wert = random.nextInt(6);
        haeufigkeit[wert]++;
        return wert + 1;
    }

    /**
     * Gibt die Häufigkeit der Würfe zurück.
     *
     * @return die Statistik mit der Häufigkeit.
     */
    public static String statistik() {
        for (int i = 0; i < haeufigkeit.length; i++) {
            System.out.println(i + 1 + ": "
                    + haeufigkeit[i] * 100 / 1000.0 + "%");
        }

        return "";
    }
}
