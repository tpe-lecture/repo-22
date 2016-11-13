package tpe.oo.metropolis;

/**
 * Erstellt eine Kapitalgesellschaft.
 *
 */
public class Kapitalgesellschaft extends Unternehmen {
    int einkommen;

    /**
     *
     * @param name Name des Unternehmens.
     * @param einkommen Einkommen
     * @param mitglied Mitglieder
     */
    Kapitalgesellschaft(String name, int einkommen, Einwohner ... mitglied) {
        super(name, einkommen, mitglied);
    }


    @Override
    public int zahleSteuern() {
        return Steuerberater.betrag(this);
    }

    /**
     * gibt die Mitgleider aus.
     */
    public void getMitglieder() {
        System.out.print("Mitglieder von " + getName() + ": ");
        if (mitglnr >= 1) {
            for (int i = 0; i < mitglnr; i++) {
                System.out.print(mitglieder[i].getName() + ", ");
            }
        }
        else {
            System.out.println("noch keine Mitglieder");
        }
        System.out.println("");
    }

}
