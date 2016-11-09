package tpe.oo.metropolis;

/**
 * Gruppen von Einwohner.
 *
 */
public abstract class Gruppe implements Steuerpflichtig {
    String name;
    int einkommen;

    /**
     * @param name Name der Gruppe
     * @param einkommen Einkommen der Gruppe
     */
    Gruppe(String name, int einkommen) {
        this.einkommen = einkommen;
        setName(name);
    }

    /**
     * gibt das Einkommen zurück.
     * @return Einkommen
     */
    public int getEinkommen() {
        return einkommen;
    }

    /**
     * setzt das Einkommen.
     * @param einkommen Einkommen
     */
    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    /**
     * gibt den Namen zurück.
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * setzt den Name.
     * @param name Name
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * berechnet Steuern.
     * @return Steuern
     */
    public abstract int zahleSteuern();

    /**
     * gibt die Mitglieder aus.
     */
    public abstract void getMitglieder();

}
