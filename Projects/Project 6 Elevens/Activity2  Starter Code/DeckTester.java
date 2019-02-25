/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"A", "B", "C"};
        String[] suits = {"Giraffes", "Lions"};
        int[] values = {2, 1, 6};
        Deck deck1 = new Deck(ranks, suits, values);

        String[] rank = {"A", "B", "C"};
        String[] suit = {"Cows", "Sheeps"};
        int[] value = {1, 2, 3};
        Deck deck2 = new Deck(rank, suit, value);

        String[] r = {"A", "B", "C"};
        String[] s = {"Mice", "Squirels"};
        int[] v = {5, 10, 60};
        Deck deck3 = new Deck(r, s, v);
    }
}
