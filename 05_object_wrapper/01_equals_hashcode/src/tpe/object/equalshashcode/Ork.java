package tpe.object.equalshashcode;

/**
 * Ork.
 */
public class Ork extends Wesen {

    /** Stärke der Orks. */
    private static final int ORK_STAERKE = 17;

    /** Zeigt an, ob der Ork gut oder böse ist. */
    @SuppressWarnings("unused")
    private boolean boese;
    /**
     * get boese.
     * @return boese boolean
     */
    public boolean isBoese() {
        return boese;
    }

    private String name;

    /**
     * Legt einen neuen Ork an.
     *
     * @param name Name des Orks.
     * @param boese zeigt an, ob der Ork gut oder böse ist
     */
    public Ork(String name, boolean boese) {
        super(name, ORK_STAERKE);
        this.boese = boese;
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ORK_STAERKE;
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
        Ork other = (Ork) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (ORK_STAERKE != other.staerke) {
            return false;
        }
        else if (boese && other.isBoese()) {
            return false;
        }
        return true;
    }
}
