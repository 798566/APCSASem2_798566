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
<<<<<<< HEAD
    private int x;
    private int y;
    private int radius;
    CanvasComponent (int radius){
        setSize(radius, radius);
        x = radius;
        y = radius;
        int r = radius;
=======
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
>>>>>>> 52d17244cacab5dea726487ce3a687857d8377b3
    }

    public void paintComponent (Graphics g){
        g.setColor(Color.black);
<<<<<<< HEAD
        g.fillOval(x, y, radius, radius);
=======
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
>>>>>>> 52d17244cacab5dea726487ce3a687857d8377b3
    }

    public void mouseClicked(MouseEvent e){}

    public void mousePressed(MouseEvent e){
<<<<<<< HEAD
        int mouseFromX = e.getX();
        int mouseFromY = e.getY();
        int r = radius;
        if (mouseFromX >= x ||     // test to see if mouse is within the shape
            mouseFromX <= (x + r) ||
            mouseFromY >= y ||     
            mouseFromY <= (y + r)) {
            boolean shapeSelected;
            }
=======
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
>>>>>>> 52d17244cacab5dea726487ce3a687857d8377b3
    }

    public void mouseReleased(MouseEvent e){
        
    }

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}
    
    
    public void mouseDragged(MouseEvent e){
<<<<<<< HEAD
        int mouseToX = e.getX();
        int mouseToY = e.getY();
        
        x =+ (x - mouseFromX);
        y =+ (y - mouseFromY); 
        
        canvasComponent.repaint;
=======
        if (shapeSelected == true){
            int mouseToX = e.getX();
            int mouseToY = e.getY();
            
            rectX += (mouseToX - mouseFromX);
            rectY += (mouseToY - mouseFromY);
            mouseFromX = mouseToX;
            mouseFromY = mouseToY;
            repaint();
        }
>>>>>>> 52d17244cacab5dea726487ce3a687857d8377b3
    }
    
    public void mouseMoved(MouseEvent e) {}
}
