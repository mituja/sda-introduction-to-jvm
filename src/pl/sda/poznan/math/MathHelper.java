package pl.sda.poznan.math;
/**
 * Klasa pomocnicza do obliczeń matematycznych
 * @author JakubMit
 * @since 1.0
 */

public class MathHelper {
    /**
     * Pomocnicza klasa, wiec zabraniamy tworzenia obiektow
     */
    private MathHelper(){
        throw new UnsupportedOperationException("Helper Class");
    }

    /**
     * Metoda obliczajaca n!
     * @param number - liczba, z ktorej chcemy policzy silnie
     * @return zwracamy wynik
     */
    public static Integer factorialRecursive(Integer number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }
}

