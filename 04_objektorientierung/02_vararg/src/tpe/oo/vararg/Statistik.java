package tpe.oo.vararg;

/**
 * Einfache Statistik-Funktionen.
 */
public final class Statistik {

    /**
     * Konstruktor.
     */
    private Statistik() {
    }
    /**
     * gibt den mittelwert zurück.
     * @param array werte
     * @return mittelwert
     */
    public static double mediand(double ...array) {
        double sum = array[0];
        for (int i = 1; array.length > i; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
        return sum / array.length;
    }
    /**
     * gibt den Mittelwert zurück.
     * @param array werte
     * @return mittelwert
     */
    public static int median(int ...array) {
        return (int) mediand(todouble(array));
    }
    /**
     * cast array von int in double.
     * @param array int array
     * @return double array
     */
    private static double[] todouble(int[] array) {
        double[] arrayd = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayd[i] = array[i] + 0.1 - 0.1;
        }
        return arrayd;
    }
}
