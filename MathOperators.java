/**
* The Program Displays Various math calculations in Java.
*
* @author  Melody Berhane
* @version 1.0
* @since   2023-2-09
*/
public final class MathOperators {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Addition
        System.out.println("3 + 8 = " + (3 + 8));
        // Subtraction
        System.out.println("4 - 6 = " + (4 - 6));
        // Multiplication
        System.out.println("2 * 5 = " + (2 * 5));
        // Division with integers
        System.out.println("30 / 5 = " + (30 / 5));
        // Division with float
        System.out.println("5 / 7 = " + (5f / 7f));
        // Division with double
        System.out.println("5 / 7 = " + (5d / 7d));
        // Exponents to power of 2
        System.out.println("6^2 = " + (Math.pow(6, 2)));
        // Exponents to power of 3
        System.out.println("3^3 = " + (Math.pow(3, 3)));
        // Square root
        System.out.println("√25 = " + (Math.sqrt(25)));
    }
}
