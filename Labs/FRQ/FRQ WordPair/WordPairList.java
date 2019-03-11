import java.util.ArrayList;
/**
 * Write a description of class WordPairList here.
 *
 * @Sophia
 * @version 311
 */
public class WordPairList
{
    private ArrayList<WordPair> allPairs;
    
    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                allPairs.add( new WordPair(words[i], words[j]));
            }
        }
    }
    
    public int numMatches() {
        int match = 0;
        for (int k = 0; k < allPairs.size(); k++) {
            WordPair pair = allPairs.get(k);
            if (pair.getFirst().equals(pair.getSecond())) {
                match++;
            }
        }
        return match;
    }
    
    public static void main(){
        String[] words = {"hi", "hello", "wilkomen", "bonjour"};
        WordPairList wpl = new WordPairList(words);
    }
}
