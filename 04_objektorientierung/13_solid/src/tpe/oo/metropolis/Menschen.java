package tpe.oo.metropolis;

/**
 * ganz normaler Mensch, der Einwohner von Metropolis ist und kein
 * Mutant ist.
 *
 */
public abstract class Menschen extends Einwohner {

    /**
     *
     * @param name Name des Menschen.
     * @param einkommen Einkommen
     */
    Menschen(String name, int einkommen) {
        super(name, einkommen);
    }
}
