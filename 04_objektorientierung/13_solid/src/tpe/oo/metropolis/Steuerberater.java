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
        if (sp instanceof Gruppe) {                                         //Gruppen zahlen keine EKS
            if (sp instanceof Personengesellschaft) {                           //Persges. erhalten Steuererleicterung
                int perSteu = ((Personengesellschaft) sp).getEinkommen()        //eingenltiche Steuern
                        / 100 * 15;
                if (perSteu > 800) {                                            //negative Steuern ausschließen
                    return perSteu - 800;
                }
                return 0;
            }
            else {
                return ((Gruppe) sp).getEinkommen() / 100 * 15;                 //andere Gruppenformen
            }
        }
        else if (sp instanceof Buerger || sp instanceof Schurke) {              //EKS
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
        if (rest > 20000) {                                 //einkommen über 20k
            if (rest > 60000) {                                 //über 60k
                if (rest > 120000) {                                //über 120k
                    abgaben += (rest - 120000) / 100 * 40;          //40% auf alles über 120k
                    rest = 120000;
                }
                abgaben += (rest - 60000) / 100 * 25;               //25% auf alles über 60k
                rest = 60000;
            }
            abgaben += (rest - 20000) / 100 * 15;                   //15% auf alles über 20k
            abgaben += 1600;                                        //8% auf alles unter 20k
        }
        else {
            abgaben = rest / 100 * 8;                               //8% auf alles unter 20k
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
