package tpe.oo.metropolis;
/**
 * Steuerberater, der den Einwohnern hilft ihre Steuern zu berechnen.
 *
 */
public class Steuerberater {
    /**
     * Gibt den Betrag, der zu zahlenden Steuern an.
     * @param sp Steuerpflichiger Bürger
     * @return Betrag der Steuern
     */
    public static int betrag(Steuerpflichtig sp) {
        if (sp instanceof Gruppe) {
            if (sp instanceof Personengesellschaft) {
                int perSteu = ((Personengesellschaft) sp).getEinkommen()
                        / 100 * 15;
                if (perSteu > 800) {
                    return perSteu - 800;
                }
                return 0;
            }
            else {
                return ((Gruppe) sp).getEinkommen() / 100 * 15;
            }
        }
        else if (sp instanceof Buerger || sp instanceof Schurke) {
            return eks(((Einwohner) sp).getEinkommen());
        }
        else {
            return 0;
        }
    }

    /**
     * Berechnet die komplizierte Einkommenssteuer von Metropolis.
     * @param einkommen Einkommen
     * @return Einkommenssteuer
     */
    private static int eks(int einkommen) {
        int rest = einkommen;
        int abgaben = 0;
        if (rest > 20000) {
            if (rest > 60000) {
                if (rest > 120000) {
                    abgaben += (rest - 120000) / 100 * 40;
                    rest = 120000;
                }
                abgaben += (rest - 60000) / 100 * 25;
                rest = 60000;
            }
            abgaben += (rest - 20000) / 100 * 15;
            abgaben += 1600;
        }
        else {
            abgaben = rest / 100 * 8;
        }
        return abgaben;
    }

    /**
     * Berechnet alle anderen Steuern.
     * @param einkommen Einkommen
     * @return Steuern
     */
    public int steuer(int einkommen) {
        return einkommen / 100 * 15;
    }

    /**
     * zum testen.
     * @param einkommen einkommen
     * @return Einkommenssteuer
     */
    public int testeks(int einkommen) {
        return eks(einkommen);
    }
}
