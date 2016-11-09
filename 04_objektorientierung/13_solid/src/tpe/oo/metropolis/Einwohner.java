package tpe.oo.metropolis;
/**
 * Einwohner von Metropolis.
 *
 */
public abstract class Einwohner {
    private int einkommen;
    private String name;

    /**
     *
     * @param name Name des Einwohners
     * @param einkommen Einkommen
     */
    Einwohner(String name, int einkommen) {
        this(name);
        this.setEinkommen(einkommen);
    }

    /**
     *
     * @param name Name des Bürgers
     */
    Einwohner(String name) {
        this.setName(name);
    }

    /**
     * gibt das Einkommen zurück.
     * @return Einkommen
     */
    public int getEinkommen() {
        return einkommen;
    }

    /**
     * Setzt das Einkommen.
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
     * Setzt den Namen.
     * @param name Name
     */
    private void setName(String name) {
        this.name = name;
    }
}
