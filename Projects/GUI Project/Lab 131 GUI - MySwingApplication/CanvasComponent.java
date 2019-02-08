import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * a2, a3
 *
 * @author Sophia
 * @ 2/6/19
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    private int x;
    private int y;
    private int width;
    private int height;

    CanvasComponent (int radius){
        setSize(radius, radius);
        width = radius;
        height = radius;
        x = radius;
        y = radius;
        int r = radius;
    }

    public void paintComponent (Graphics g){
        g.setColor(Color.black);
        g.fillOval(x, y, width, height);
    }

    public void mouseClicked(MouseEvent e){}

    public void mousePressed(MouseEvent e){
        int mouseFromX = e.getX();
        int mouseFromY = e.getY();
        
        if (mouseFromX >= x ||     // test to see if mouse is within the shape
            mouseFromX <= (x + r) ||
            mouseFromY >= y ||     
            mouseFromY <= (y + r)) {
            boolean shapeSelected;
            }
    }

    public void mouseReleased(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}
    
    
    public void mouseDragged(MouseEvent e){
        
    }
    
    public void mouseMoved(MouseEvent e) {}
}
