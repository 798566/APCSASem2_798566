import java.util.ArrayList;
/**
 * Write a description of class prob4 here.
 *
 * @author Sophia
 * @version 0415
 */
public class prob4
{
    private ArrayList<String> names;
    String word;

    public void sortStrings(ArrayList<String> names) {
        int compare = 0;
        for (int i = 1; i < names.size(); i++) {
            for (int j = i; j > 0; j--) {
                compare++;
                if (names.get(j).compareTo(names.get(j-1)) < 0) {
                    String temp = names.get(j);
                    names.set(j, names.get(j-1));
                    names.set(j-1, temp);
                }
            }
        }
    }

    public void shuffleStrings(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            String temp = names.get(i);
            int random = (int)(Math.random()*names.size()+1);
            names.set(i, names.get(random));
            names.set(random, temp);
        }
    }

    public void insertString(String word) {
        int pos = names.size()/2;
        boolean valid = false;
        while (!valid) {
            if (names.get(pos).compareTo(word) == 0) {
                names.add(pos, word);
                valid = true;
            }
            else if (names.get(pos).compareTo(word) < 0) {
                pos++;
            }
            else {
                pos--;
            }
        }
    }
}
