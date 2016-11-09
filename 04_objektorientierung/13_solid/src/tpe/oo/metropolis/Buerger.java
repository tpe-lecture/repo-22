package tpe.oo.metropolis;
/**
 * Bürger wohnen in Metropolis und haben einfach so
 *  ein Einkommen ohne zu arbeiten.
 *
 */
public class Buerger extends Menschen implements Steuerpflichtig {

    /**
     *
     * @param name Name des Bürgers
     * @param einkommen Einkommen des Bürgers
     */
    Buerger(String name, int einkommen) {
        super(name, einkommen);
        Finanzamt fa = Finanzamt.createFA();
        fa.addZahler((Steuerpflichtig) this);
    }


    /**
     * gibt zurück wie viel Steuern der Bürger zahlen muss.
     * @return Steuern
     */
    public int zahleSteuern() {
        return Steuerberater.betrag(this);
    }

}
