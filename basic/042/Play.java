/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Play{

    /**
     * Returns the total playable game amount.
     *
     * @param double total owned money.
     * @param double price per game.
     * @return The playable game amount.
     */
    public static int play(double money, double roundPrice) {
        return (int) Math.floor(money/roundPrice);
    }

    /**
     * Implements Exercise: 4.2
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double money = 10;
        double roundPrice = 3;
        int totalGames = play(money, roundPrice);
        System.out.println(totalGames);
    }
}

// End of file
