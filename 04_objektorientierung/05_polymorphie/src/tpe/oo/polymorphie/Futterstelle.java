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






//    /**
//     * Füttert den Affen.
//     *
//     * @param affe Affe, der gefüttert werden soll.
//     */
//    public void gibFutter(Affe affe) {
//        affe.fuettern();
//    }
//
//    /**
//     * Füttert den Gorilla.
//     *
//     * @param gorilla Gorilla, der gefüttert werden soll.
//     */
//    public void gibFutter(Gorilla gorilla) {
//        gorilla.fuettern();
//    }
//
//    /**
//     * Füttert die Giraffe.
//     *
//     * @param giraffe Giraffe, die gefüttert werden soll.
//     */
//    public void gibFutter(Giraffe giraffe) {
//        giraffe.fuettern();
//    }
}
