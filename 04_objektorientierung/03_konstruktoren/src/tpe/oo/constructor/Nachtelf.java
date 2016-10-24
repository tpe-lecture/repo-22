package tpe.oo.constructor;

/**
 * Nachtelf aus der Allianz.
 */
public class Nachtelf  extends Wesen {



    /** Standardmäßige Stärke der Fähigkeit Naturwiderstand. */
    public static final int STANDARD_NATURWIDERSTAND = 5;

    /** Fähigkeit zum Widerstand gegen Naturmagie */
    private int naturwiderstand;

    // Konstruktoren fehlen. Bitte hier einfügen.
    public Nachtelf(String name) {
        super(name);
        this.naturwiderstand=Nachtelf.STANDARD_NATURWIDERSTAND;
    }
    public Nachtelf(String name, int staerke){
        this(name);
        this.naturwiderstand=staerke;
    }
    /**
     * Stärke des Naturwiderstandes.
     *
     * @return the naturwiderstand
     */
    public int getNaturwiderstand() {
        return naturwiderstand;
    }
}
