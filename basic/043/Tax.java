/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Tax{

    /**
     * Returns tax amount compared to salary and percentage.
     *
     * @param double Yearly Salary.
     * @param double Percentage.
     * @return The amount of tax.
     */
    public static double taxes(double yearlySalary, double percentage) {
        double taxes;
        taxes = (yearlySalary*percentage)/100;
        return taxes;
    }

    /**
     * Implements Exercise: 4.3
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double yearlySalary = 120;
        double percentage = 25;
        double taxes = taxes(yearlySalary, percentage);
        System.out.printf("%.1f", taxes);
    }
}

// End of file
