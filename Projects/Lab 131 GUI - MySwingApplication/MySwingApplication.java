import javax.swing.*;
/**
 *  a1
 *
 * @author Sophia
 * @ 2/6/19
 */
public class MySwingApplication implements Runnable
{
    JFrame jFrame;
    CanvasComponent canvasComponent;
    public void run(){
        jFrame = new JFrame("Window");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvasComponent = new CanvasComponent(100,100);
        jFrame.add(canvasComponent);
        jFrame.setVisible(true);
        jFrame.addKeyListener(canvasComponent);
    }
    
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
