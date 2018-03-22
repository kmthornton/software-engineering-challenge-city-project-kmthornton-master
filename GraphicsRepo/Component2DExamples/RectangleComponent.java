import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

/*
   A component that draws some rectangles.
*/
public class RectangleComponent extends JComponent

{  
    
    int x,y,w,h;
    Rectangle box;
    Graphics2D g2;
    Color mycolor;
    /**
     * Default Constructor, sets data
     */
    public RectangleComponent()
    {
        this.x = 5;
        this.y = 10;
        this.w = 20;
        this.h = 30;
        box = new Rectangle(x, y, w, h);
        mycolor = Color.RED;
        
    }
    /**
     * Constructor that takes x,y,w,h values
     */
    public RectangleComponent(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        box = new Rectangle(x, y, w, h);
        mycolor= Color.BLUE;
        
        
    }
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      g2 = (Graphics2D) g;

      // Construct a rectangle and draws 1
      //Rectangle box = new Rectangle(5, 10, 20, 30);
      //g2.fill(box)
      
      //sets the color, components drawen after will be this color
      g2.setColor(mycolor);
      

      // a row of Rectangles
      for (int i = 0; i < 11; i++){
          
        Rectangle box2 = new Rectangle(x + 30*i, y, w, h);
        g2.fill(box2);
}
    
   }
   
   
       public void nextFrame(int time)
    {

        // update the objects in the cityscape so they are animated
        // ... change position, color, size
        
           //change to color of the box
           if(time%2 == 0)
                mycolor =Color.BLACK;
           else
                mycolor = Color.YELLOW;
           
           
           
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
}
