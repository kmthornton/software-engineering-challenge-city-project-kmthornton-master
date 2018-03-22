import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.awt.Ellipse;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/*
   A component that draws Circle
*/
public class CircleComponent extends JComponent
{  
    double x,y,d;
    Ellipse2D.Double circle1;
    /**
     * Constructor takes x,y,d
     * d is used for both width and height
     */
    CircleComponent(int x, int y, int d)
    {
        this.x = x;
        this.y = y;
        this.d = d;
        
        circle1 = new Ellipse2D.Double(x,y,d,d);
        
    }
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D 
      Graphics2D g2 = (Graphics2D) g;
      
      //outline of a circle
      g2.draw(circle1);
      //solid circle
      //g2.fill(circle1);
      
      for (int i = 1 ; i < 5;i++)
      {
         g2.draw(circle1); 
      }

   }
   
      public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        d = d*1.2;
        circle1.setFrame(x,y,d,d);
       
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
        //}
    }
}
