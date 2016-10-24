package tpe.oo.constructor;

/**
 * Untoter aus der Horde.
 */
public class Untoter  extends Wesen  {



    /** Standardmäßige Stärke der Fähigkeit zur Unterwasseratmung. */
    public static final int STANDARD_UNTERWASSERATMUNG = 10;

    /** Fähigkeit zur Atmung unter Wasser. */
    private int unterwasseratmung;

    // Konstruktoren fehlen. Bitte hier einfügen.
    public Untoter(String name) {
        super(name);
        this.unterwasseratmung=this.STANDARD_UNTERWASSERATMUNG;
    }

    public Untoter(String name, int staerke){
        this(name);
        this.unterwasseratmung=staerke;
    }

    /**
     * Fähigkeit zur Unterwasseratmnung.
     *
     * @return the Stärke der Fähigkeit.
     */
    public int getUnterwasseratmung() {
        return unterwasseratmung;
    }
}
