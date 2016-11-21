package tpe.enumeration.own;


/**
 * Ein einfacher Würfel.
 */
public enum Wuerfeltyp {
        /** 4-seitiger Würfel. */
        D4(4),
        /** 6-seitiger Würfel. */
        D6(6),
        /** 8-seitiger Würfel. */
        D8(8),
        /** 10-seitiger Würfel. */
        D10(10),
        /** 12-seitiger Würfel. */
        D12(12),
        /** 20-seitiger Würfel. */
        D20(20);
    /**
     * Anzahl der Seitenflächen.
     */
    public final int seitenFlaechen;


    /**
     * neuer Würfel.
     * @param seiten Seitenflächen Anzahl
     */
    Wuerfeltyp(int seiten) {
        seitenFlaechen = seiten;
    }

    /**
     *
     * @return erwarter Durchschitt.
     */
    public double average() {
        return (seitenFlaechen) / 2 + 0.5;
    }



}
