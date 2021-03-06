//********************************************************************
//  StickFigure.java       Author: Lewis/Loftus/Cocking
//
//  Represents a graphical stick figure.
//********************************************************************

import java.awt.*;

public class StickFigure
{
   private int baseX;     // center of figure
   private int baseY;     // floor (bottom of feet)
   private Color color;   // color of stick figure
   private int height;    // height of stick figure
   private int arm;
   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public StickFigure(int center, int bottom, Color shade, int size)
   {
      baseX = center;
      baseY = bottom;
      color = shade;
      height = size;
   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      int top = baseY - height;  // top of head

      page.setColor (color);

      // head           x      y  height width
      page.drawOval(baseX-10, top,  20,   20);

      // trunk
      page.drawLine(baseX, top+20, baseX, baseY-30);

      page.drawLine (baseX, baseY-30, baseX-15, baseY);  // legs
      page.drawLine (baseX, baseY-30, baseX+15, baseY);

      //page.drawLine (baseX, baseY-70, baseX-50, baseY-70);  // arms
     
      //dabber
     // page.drawLine (baseX, baseY-70, baseX+20, baseY-70);
      //page.drawLine (baseX+20, baseY-70, baseX+1, baseY-100);

   }
   /**
    * setHeight method
    */
   public void setHeight(int size)
   {
       height = size;
    }
   public void dab()
   {
       
    }
}
