
/**
 * Write a description of class N3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class N3
{
    private String str;

    public N3()
    {
        this.str = str;
    }

    public String findFirstRepeating(String letters)
    {
        String rep = "";
        for(int i = 0; i < letters.length()-1; i++){
            String current = letters.substring(i,i+1);
            for (int j = i; j < letters.length(); j++){
                if (current.equals(letters.substring(j,j+1))){
                    rep = letters.substring(i,i+1);
                }
            }
        }
        return rep;
    }
}
