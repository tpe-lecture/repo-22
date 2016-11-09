package tpe.oo.metropolis;
/**
 * Ein Schurke ist ein böser Mutant mit einer Schwäche, durch die er verletzlich
 * wird. Schurken können sich in einem Syndikat zusammenschließen.
 *
 */
public class Schurke extends Mutant implements Steuerpflichtig {
    final Superkraft schwaeche;

    /**
     *
     * @param name Name des Schurken
     * @param mutation Mutation des Schurken
     * @param einkommen Einkommen des Schurken
     * @param schwaeche die Schwäche des Schurken
     */
    Schurke(String name, String mutation, int einkommen, Superkraft schwaeche) {
        super(name, mutation, einkommen);
        this.schwaeche = schwaeche;
        Finanzamt fa = Finanzamt.createFA();
        fa.addZahler((Steuerpflichtig) this);
    }

    /**
     * gibt die Schwäche des Schurkens zurück.
     * @return Schwäche
     */
    public Superkraft getSchwaeche() {
        return schwaeche;
    }

    @Override
    public int zahleSteuern() {
        return Steuerberater.betrag(this);
    }

    @Override
    void kaempfe(Superkraft ...superkrafts) {
        if (gewinnt(superkrafts)) {
            System.out.println(getName() + " gewinnt! Schwäche nicht erkannt.");
        }
        else {
            System.out.println("Gegener gewinnt! Schwäche erkannt.");
        }
    }

    /**
     * Überprüft ob der Schurke gegen die angegebene Superkraft gewinnt.
     * @param superkrafts Superkräfte des Gegners
     * @return gewinnt der Schurke?
     */
    private boolean gewinnt(Superkraft ...superkrafts) {
        for (int i = 0; i < superkrafts.length; i++) {
            if (superkrafts[i].equals(schwaeche)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Übergibt die Superkräfte eines Superhelden.
     * @param held Superhelden
     */
    public void kaempfe(Superheld held) {
        kaempfe(held.getSuperkraefte());
    }

}
