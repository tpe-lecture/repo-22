package tpe.exceptions.handledeclare;

/**
 * Ausnahme, wenn die Statisitk nicht konsistent ist.
 */
public class StatistikException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Legt eine neue Ausnahme an.
     */
    public StatistikException() {
    }

    /**
     * Legt eine neue Ausnahme an.
     *
     * @param message die Nachricht.
     */
    public StatistikException(String message) {
        super(message);
    }

    /**
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        return getMessage();
    }
}
