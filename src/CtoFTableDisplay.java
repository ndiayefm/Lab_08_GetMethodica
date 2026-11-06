public class CtoFTableDisplay {

    public static void main(String[] args) {

        // Formatted table headers

        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");

        System.out.println("-------------------------");



        // Loop from -100 to 100 inclusive in 1-degree steps

        for (double celsius = -100.0; celsius <= 100.0; celsius++) {

            double fahrenheit = CtoF(celsius);

            System.out.printf("%-10.1f | %-10.1f\n", celsius, fahrenheit);

        }

    }



    /**

     * Converts a Celsius input to equivalent Fahrenheit

     * Formula: (Celsius * 9/5) + 32

     */

    public static double CtoF(double celsius) {

        return (celsius * 9.0 / 5.0) + 32.0;

    }

}

