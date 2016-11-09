package tpe.oo.metropolis;
/**
 * Personengesellschaft, die Bürger oder Superhelden als Mitglieder hat.
 * Sie bekommt auch Steuererleichterung.
 *
 */
public class Personengesellschaft extends Unternehmen
    implements Steuerpflichtig {

    int einkommen;

    /**
     *
     * @param name Name
     * @param einkommen Einkommen
     * @param mitglied Mitglieder
     */
    Personengesellschaft(String name, int einkommen, Einwohner ... mitglied) {
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
