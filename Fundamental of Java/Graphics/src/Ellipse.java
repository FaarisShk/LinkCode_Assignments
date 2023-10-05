import java.awt.*;
import javax.swing.*;
 
public class Ellipse extends JApplet {
 
    public void init()
    {
        // set size
        setSize(400, 400);
 
        repaint();
    }
 
    // paint the applet
    public void paint(Graphics g)
    {
        // set Color for rectangle
        g.setColor(Color.red);
 
        // draw a ellipse
        g.drawOval(100, 100, 150, 100);
        
        // draw a rectangle
        g.setColor(Color.blue);
        g.drawRect(100, 300, 200, 200);
        
        // draw a rectangle by drawing four lines
        g.setColor(Color.green);
        g.drawLine(100, 600, 300, 600);
        g.drawLine(100, 600, 100, 700);
        g.drawLine(100, 700, 300, 700);
        g.drawLine(300, 600, 300, 700);
        
        
    }
}
