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
    private int rectX;
    private int rectY;
    private int rectWidth;
    private int rectHeight;
    public int mouseFromX;
    public int mouseFromY;
    public boolean shapeSelected;
    
    CanvasComponent (int width, int height){
        setSize(width, height);
        rectX = 0;
        rectY = 0;
        rectWidth = 100;
        rectHeight = 100;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent (Graphics g){
        g.setColor(Color.black);
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
    }

    public void mouseClicked(MouseEvent e){}

    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        
        if (mouseFromX >= rectX &&     // test to see if mouse is within the shape
            mouseFromX <= (rectX + rectWidth) &&
            mouseFromY >= rectY &&     
            mouseFromY <= (rectY + rectHeight)) {
            shapeSelected = true;
        }
        else {
            shapeSelected = false;
        }
    }

    public void mouseReleased(MouseEvent e){
        
    }

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}
    
    
    public void mouseDragged(MouseEvent e){
        if (shapeSelected == true){
            int mouseToX = e.getX();
            int mouseToY = e.getY();
            
            rectX += (mouseToX - mouseFromX);
            rectY += (mouseToY - mouseFromY);
            mouseFromX = mouseToX;
            mouseFromY = mouseToY;
            repaint();
        }
    }
    
    public void mouseMoved(MouseEvent e) {}
}
