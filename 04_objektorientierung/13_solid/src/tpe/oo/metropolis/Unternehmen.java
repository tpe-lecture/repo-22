package tpe.oo.metropolis;

import java.lang.reflect.Array;

/**
 * Unternehmen, die Steuern zahlen und von Einwohnern geführt werden.
 */
public abstract class Unternehmen extends Gruppe implements Steuerpflichtig {
    static int mitglnr = 0;
    Einwohner[] mitglieder;
    Finanzamt fa = null;

    /**
     *
     * @param name Name
     * @param einkommen Einkommen
     * @param mitglied Einwohner
     */
    Unternehmen(String name, int einkommen, Einwohner ... mitglied) {
        super(name, einkommen);
        for (int i = 0; i < mitglied.length; i++) {
            addMitglied(mitglied[i]);
        }
        mitglnr = mitglieder.length;
        this.einkommen = einkommen;
        fa = Finanzamt.createFA();
        fa.addZahler((Steuerpflichtig) this);
    }

    @Override
    public abstract int zahleSteuern();

    /**
     * Fügt einen neuen Einwohner zum Vorstand hinzu.
     * @param neuesMitglied Einwohner
     */
    public void addMitglied(Einwohner neuesMitglied) {
        if (!(neuesMitglied == null)) {
            if (neuesMitglied instanceof Buerger
                    || neuesMitglied instanceof Superheld) {
                if (mitglnr > 0) {
                    Object newArray = Array.newInstance(
                            mitglieder.getClass().getComponentType(),
                            Array.getLength(mitglieder) + 1);
                    System.arraycopy(mitglieder, 0, newArray, 0,
                            mitglieder.length);
                    mitglieder = (Einwohner[]) newArray;
                    mitglieder[mitglnr] = neuesMitglied;
                    ++mitglnr;
                    System.out.println("neues Mitglied: "
                            + mitglieder[mitglnr - 1].getName());
                }
                else {
                    mitglieder = new Einwohner[1];
                    this.mitglieder[0] = neuesMitglied;
                    mitglnr++;
                    System.out.println("erstes Mitglied: "
                            + mitglieder[mitglnr - 1].getName());
                }
            }
            else {
                System.out.println("Mitglied nicht berechtigt");
            }
        }
    }


}
