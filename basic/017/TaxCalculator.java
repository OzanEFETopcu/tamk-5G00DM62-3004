/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class TaxCalculator {


    static final double NOMINAL_TAX_RATE = 27.3;
    static final double EXTRA_TAX_RATE = 21;

    /**
    * Return user name line.
    *
    * @param int seperate types of earning.
    * @return Total tax, new income values in sentence format.
    */
    public static String calculate(int work_earning, int stock_earning) {
        double work_tax = work_earning * ((NOMINAL_TAX_RATE)/100);
        double stock_tax = stock_earning * ((EXTRA_TAX_RATE)/100);
        double total_tax = work_tax + stock_tax;
        double net_income = (work_earning + stock_earning)-total_tax;
        return "Taxes Total : " + total_tax + "\nNet Income :  " + net_income + " (after taxes)";
    }

    /**
    * Exercise: 1.7
    * Write the Tax calculator program.
    *
    * @param args Command line arguments. Not used.
    */
    public static void main(String[] args) {
        String answer = calculate(111000, 23000);
        System.out.println(answer);
    }
}

// End of file
