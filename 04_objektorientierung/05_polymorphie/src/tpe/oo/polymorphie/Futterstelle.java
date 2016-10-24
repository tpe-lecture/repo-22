package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {
    /**
     *
     * @param tier zu fütterndes Tier
     */
    public static void gibFutter(ZooTier[] tier) {
        for (int i = 0; i < tier.length; i++) {
            tier[i].fuettern();
        }
    }
}
