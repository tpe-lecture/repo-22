package tpe.oo.statics;

/**
 * Spiel mit den Würfeln.
 */
public final class Spiel {

    /** Keine Objekte. */
    private Spiel() {
        // leer
    }

    /**
     * Programm-Einstieg.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        // 1000 Mal würfeln
        for (int i = 0; i < 1000; i++) {
            Wuerfel.wuerfele();
        }

        // Statistik ausgeben
        System.out.println("Statistik für Würfel");
        System.out.println(Wuerfel.statistik());
        System.out.println();

    }
}
