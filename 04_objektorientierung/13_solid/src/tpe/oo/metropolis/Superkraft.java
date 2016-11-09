package tpe.oo.metropolis;

/**
 * Eine Superkraft die auch die Schwäche von Schurken angibt.
 *
 */
public class Superkraft {
    String name;

    /**
     * @param name Name der Superkraft.
     */
    Superkraft(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * Entscheidet wann zwei Superkräfte gleich sind.
     * @param obj Superkraft
     * @return gleich?
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
        Superkraft other = (Superkraft) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

}
