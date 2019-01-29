
/**
 * Write a description of class Mario here.
 *
 * @author Sophia
 * @version 0129
 */
public class Mario extends Character
{
    // instance variables - replace the example below with your own
    private int x;

    public Mario( String catchphrase, int speed)
    {
        // initialise instance variables
        x = 0;
    }

    public void setSpeed(int speed)
    {
        super.setSpeed(speed*2);
    }
}
