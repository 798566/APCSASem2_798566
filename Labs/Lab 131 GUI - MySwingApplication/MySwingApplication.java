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
    public void run(){
        jFrame = new JFrame("Window");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
