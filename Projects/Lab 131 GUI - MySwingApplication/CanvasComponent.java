import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * CanvasComponent of the GUI project :)
 *
 * @author Sophia
 * @ 2/6/19
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    private int rectX;
    private int rectY;
    private int rectWidth;
    private int rectHeight;
    public int mouseFromX;
    public int mouseFromY;
    public boolean shapeSelected;
    
    // act. 4
    int animationDeltaX;
    int animationDeltaY;
    int gutterX;
    int gutterY;
    Timer animationTimer;
    
    CanvasComponent (int width, int height){
        setSize(width, height);
        rectX = 0;
        rectY = 0;
        rectWidth = 100;
        rectHeight = 100;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        
        animationDeltaX = 1;
        animationDeltaY = 0;
        gutterX = 10;
        gutterY = 10;
        
        animationTimer = Timer(20, this);
        animationTimer.start();
        
        
        int motionSpeed = 1;
    }

    public void paintComponent (Graphics g){  // fig creation
        g.setColor(Color.black);
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
    }

    public void mouseClicked(MouseEvent e){}

    public void mousePressed(MouseEvent e){ // shapeSelected?
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

    public void mouseReleased(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}
    
    
    public void mouseDragged(MouseEvent e){  // move fig. via dragging (shapeSelected)
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
    
    
    public void actionPerformed(ActionEvent e) {  // act. 4 (outside Shape)
        if (shapeSelected == false){
            Dimension componentSizeDimensionX = getWidth();
            Dimension componentSizeDimensionY = getHeight();
            if ((rectX + rectWidth) + animationDeltaX + gutterX > componentSizeDimensionX){  // move down
                animationDeltaX = 0;
                animationDeltaY = 1;
                rectX = componentSizeDimensionX - rectWidth - gutterX;
                rectY += animationDeltaY;
            }
            else if ((rectY + rectHeight) + animationDeltaY + gutterY > componentSizeDimensionY){ // move left
                animationDeltaX = -1;
                animationDeltaY = 0;
                rectY = componentSizeDimensionY - rectHeight - gutterY;
                rectX += animationDeltaX;
            }
            else if (rectX < gutterX){  // move right
                animationDeltaX = 0;
                animationDeltaY = -1;
                rectX = gutterX;
                rectY += animationDeltaY;
            }
            else if (rectY < gutterY){  // move right
                animationDeltaX = -1;
                animationDeltaY = 0;
                rectY = gutterY;
                rectX += animationDeltaX;
            }
            else{
                rectX += animationDeltaX;
                rectY += animationDeltaY;
            }
            repaint();
        }
    }
    
    
    public void keyTyped(KeyEvent e){
        
    }
    
    public void keyPressed(KeyEvent e){}
    
    public void keyReleased(KeyEvent e){}
}
