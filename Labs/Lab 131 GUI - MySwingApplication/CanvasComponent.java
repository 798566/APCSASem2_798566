import java.awt.*;
import javax.swing.*;
/**
 * a2
 *
 * @author Sophia
 * @ 2/6/19
 */
public class CanvasComponent extends JComponent
{
    private int x;
    private int y;
    private int width;
    private int height;
    
    public CanvasComponent (int width, int height){
        CanvasComponent.setSize(width, height);
        x = 200;
        y = 200;
        width = 10;
        height = width;
    }
    public void paintCanvas (int x, int y, int width, int height){
        CanvasComponent.setColor();
        CanvasComponent.fillOval(x,y,width,height);
    }
    
}
