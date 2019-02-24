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
    private int radius;
    CanvasComponent (int radius){
        setSize(radius, radius);
        x = radius;
        y = radius;
        int r = radius;
    }

    public void paintComponent (Graphics g){
        g.setColor(Color.black);
        g.fillOval(x, y, radius, radius);
    }

    public void mouseClicked(MouseEvent e){}

    public void mousePressed(MouseEvent e){
        int mouseFromX = e.getX();
        int mouseFromY = e.getY();
        int r = radius;
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
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        
        x =+ (x - mouseFromX);
        y =+ (y - mouseFromY); 
        
        canvasComponent.repaint;
    }
    
    public void mouseMoved(MouseEvent e) {}
}
