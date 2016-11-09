package tpe.oo.metropolis;
/**
 * Richter, die hoffentlich nicht korrupt sind und deswegen
 *  auch keine Steuern zahlen müssen.
 *
 */
public class Richter extends Menschen {
    private boolean korrupt = false;

    /**
     *
     * @param name Name
     * @param einkommen Einkommen
     * @param korrupt Korrupt?
     */
    Richter(String name, int einkommen, boolean korrupt) {
        super(name, einkommen);
        setKorrupt(korrupt);
    }

    /**
     *
     * @return Korrupt?
     */
    public boolean isKorrupt() {
        return korrupt;
    }

    /**
     *
     * @param korrupt Korrupt?
     */
    public void setKorrupt(boolean korrupt) {
        this.korrupt = korrupt;
    }

    /**
     * Entscheidet ob der Schurke verurteilt wird.
     * @param boesewicht der böse Bösewicht
     */
    public void verurteilen(Schurke boesewicht) {
        if (schuldig()) {
            System.out.println(boesewicht.getName() + " ist nicht schuldig!");
        }
        else {
            System.out.println(boesewicht.getName() + " ist schuldig!");
        }
    }

    /**
     * entscheidet ob der Schurke schuldig ist.
     * @return schuldig?
     */
    private boolean schuldig() {
        return korrupt;
    }
}
