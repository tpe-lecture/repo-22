package tpe.oo.metropolis;

/**
 * Singleton Finanzamt.
 *
 */
public final class Finanzamt {
    /**
     * privater Konstruktor.
     */
    private Finanzamt() {
    }

    /**
     * die einzige Instanz des Finanzamts.
     */
    public static final Finanzamt INSTANCE = new Finanzamt();

    /**
     * Gibt die einzige Instanz des Finanzamts zurück.
     * @return Finanzamt
     */
    public static Finanzamt createFA() {
        return INSTANCE;
    }

    Steuerpflichtig[] steuer = new Steuerpflichtig[100];
    int pflichtige = 0;

    /**
     * Lässt die Steuern aller Steurpflichtigen Einwohner zurück.
     * @return Steuern
     */
    public int steuernausgeben() {
        int alleSteuern = 0;
        for (int i = 0; i < pflichtige; i++) {
            alleSteuern += steuer[i].zahleSteuern();
        }
        return alleSteuern;
    }

    /**
     * Fügt einen neuen Steuerzahler hinzu.
     * @param neuerZahler der neue Steuerzahler
     */
    public void addZahler(Steuerpflichtig neuerZahler) {
        if (pflichtige <= 100) {
            steuer[pflichtige] = neuerZahler;
            pflichtige++;
        }
        else {
            System.out.println("Steuer voll");
        }
    }

    /**
     * Berechnet die Steuern für einen bestimmten Steuerzahler.
     * @param zahler Steuerzahler
     * @return Steuern
     */
    public int calcSteuern(Steuerpflichtig zahler) {
        return zahler.zahleSteuern();
    }

}


