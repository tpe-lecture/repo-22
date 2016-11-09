package tpe.oo.metropolis;

import java.lang.reflect.Array;
/**
 * Ein Syndikat ist ein Zusammenschluss von Schurken.
 *
 */
public class Syndikat extends Gruppe {
    Schurke[] mitglieder;
    int mitglnr = 0;
    int einkommen = 0;
    Finanzamt fa = null;
    /**
     * @param name Name des Syndikats
     * @param mitglied Schurken, die am Syndikat Teil haben.
     */
    Syndikat(String name, Schurke ... mitglied) {
        super(name, calcEinkommen(mitglied));
        mitglnr = mitglied.length;
        mitglieder = new Schurke[mitglnr];
        System.arraycopy(mitglied, 0, mitglieder, 0, mitglieder.length);
        fa = Finanzamt.createFA();
        fa.addZahler((Steuerpflichtig) this);
    }

    /**
     * Berechnet die Steuern die das Syndikat zahlen muss.
     * @param mitglied benötigt alle Mitgleider
     * @return Steuern
     */
    private static int calcEinkommen(Schurke[] mitglied) {
        int add = 0;
        for (int i = 0; i < mitglied.length; i++) {
            add += mitglied[i].getEinkommen();
        }
        return add;
    }

    /**
     * gibt alle Mitglieder aus.
     */
    public void getMitglieder() {
        System.out.print("Mitglieder von " + getName() + ": ");
        for (int i = 0; i < mitglieder.length; i++) {
            System.out.print(mitglieder[i].getName() + ", ");
        }
        System.out.println("");
    }
    /**
     * Fügt ein neues Mitglied hinzu und berechnet das neue Einkommen.
     * @param neuerBoesewicht neues Mitglied
     */
    public void addMitglied(Schurke neuerBoesewicht) {
        Object newArray = Array.newInstance(
                mitglieder.getClass().getComponentType(),
                Array.getLength(mitglieder) + 1);
        System.arraycopy(mitglieder, 0, newArray, 0, mitglieder.length);
        mitglieder = (Schurke[]) newArray;
        mitglieder[mitglnr] = neuerBoesewicht;
        ++mitglnr;
        this.einkommen += neuerBoesewicht.getEinkommen();
    }
    /**
     * gibt das Einkommen des Syndikats zurück.
     * @return Einkommen
     */
    public int getEinkommen() {
        this.einkommen = calcEinkommen(mitglieder);
        return einkommen;
    }



    @Override
    public int zahleSteuern() {
        return Steuerberater.betrag(this);
    }
}
