package tpe.oo.singleton;

/**
 * Klasse, die den Superhelden Batman repräsentiert.
 */
public final class Batman {

    /** Flag, das anzeigt, ob Batman seinen Batsuit an hat. */
    private boolean batsuitAngezogen;
    static int zaehler;

    /**
     * Erzeugt neuen Batman.
     */
    public static final Batman Instance = new Batman();



    /**
     * Erzeugt einen neune Batman.
     */
    private Batman() {
        batsuitAngezogen = false;
    }
    /**
     * Kreiert einen Batman.
     * @return batman
     */
    public static Batman createBatman() {
        if (zaehler == 0) {
            return Instance;
        }
        return null;
    }

    /**
     * Bat man zieht sich in seiner Batcave um.
     */
    public void umziehen() {
        batsuitAngezogen = !batsuitAngezogen;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Batman " + (batsuitAngezogen ? "mit" : "ohne") + " Batsuit";
    }
}
