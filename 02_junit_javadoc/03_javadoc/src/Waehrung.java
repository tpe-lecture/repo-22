/**
 *
 *Verwaltet eine bestimmte Währung (z.B. Euro)
 *@author Philip
 */
public class Waehrung {

    /**
     *Gibt den Kurs einer Währung an.
     */
    private final int kurs;

    /**
     *Gibt den Name einer Währung an.
     */
    private final String name;

    /**
     * Gibt das Kürzel einer Währung an.
     */
    private final String kuerzel;

    /**
     * Gibt die Genauigkeit der Währung an.
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     * rechnet zwischen Währungen um.
     *@param betrag Der umzurechnende Betrag.
     *@param toWaehrung Die Währung in der der Betrag zurückgegeben werden soll.
     *@return gibt den Betrag in der angegebenen Währung an.
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     *@return gibt den Kurs zurück.
     *
     */
    public int getKurs() {
        return kurs;
    }

    /**
     *
     * @return gibt den Namen zurück.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return gibt das Kürzel zurück.
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
