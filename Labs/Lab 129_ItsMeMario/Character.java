
/**
 * Write a description of class Character here.
 *
 * @author Sophia
 * @version 0129
 */
public class Character
{
    private String catchphrase;
    private int speed;

    public Character(String slogan, int fastness)
    {
        catchphrase = slogan;
        speed = fastness;
    }
    
    public void setCatchphrase(String slogan){
        catchphrase = slogan;
    }
    public String getCatchphrase(){
        return catchphrase;
    }
    public void setSpeed(int fastness){
        speed = fastness;
    }
    public int getSpeed(){
        return speed;
    }
}
