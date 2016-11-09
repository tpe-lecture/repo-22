package tpe.oo.metropolis;
/**
 * Superhelden beschützen Metropolis, in dem sie gegen Bösewichte kämpfen.
 *
 */
public class Superheld extends Mutant {
    Superkraft[] kraefte;
    /**
     *
     * @param name Name
     * @param mutation Mutation
     * @param kraefte Superkräfte
     */
    Superheld(String name, String mutation, Superkraft ... kraefte) {
        super(name, mutation);
        this.kraefte  = new Superkraft[kraefte.length];
        System.arraycopy(kraefte, 0, this.kraefte, 0, this.kraefte.length);
    }

    @Override
    void kaempfe(Superkraft... superkrafts) {
        if (gewinnt(superkrafts)) {
            System.out.println(getName() + " gewinnt! Schwäche erkannt.");
        }
        else {
            System.out.println("Gegener gewinnt! Schwäche nicht erkannt.");
        }
    }

    /**
     * überprüft ob ein Held die Schwäche eines Schurken findet.
     * @param superkrafts Kräfte
     * @return gewinnt der Held?
     */
    boolean gewinnt(Superkraft ...superkrafts) {
        for (int i = 0; i < superkrafts.length; i++) {
            for (int j = 0; j < kraefte.length; j++) {
                if (superkrafts[i].equals(kraefte[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * übergibt die Superkräfte.
     * @return Kräfte
     */
    public Superkraft[] getSuperkraefte() {
        return kraefte;
    }

    /**
     * Übergibt die Superkräfte des Heldens.
     * @return Kräfte
     */
    public String superkraefte() {
        String kraft = "Kräfte: ";
        for (int j = 0; j < kraefte.length; j++) {
            kraft += kraefte[j];
        }
        return kraft;
    }

}
