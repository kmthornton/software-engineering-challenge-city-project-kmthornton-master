//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class LineUp2 extends Applet
{
   private final int APPLET_WIDTH = 400;
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45;
   Random generator = new Random();
   private StickFigure2 figure1, figure2, figure3, figure4;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public void init ()
   {
      int h1, h2, h3, h4;  // heights of stick figures
      Random generator = new Random();

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE*300);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);


      figure1 = new StickFigure2 (100, 150, Color.red, h1);
      figure2 = new StickFigure2 (200, 150, Color.black, h2);
      figure3 = new StickFigure2 (300, 150, Color.black, h3);
      figure4 = new StickFigure2 (400, 150, Color.black, h4);

      Thread t1 = new Thread(figure1);
      t1.start();
      Thread t2 = new Thread(figure2);
      t2.start();
      Thread t3 = new Thread(figure3);
      t3.start();
      Thread t4 = new Thread(figure4);
      t4.start();
      
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      
      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure1.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure2.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure3.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure4.setHeight(newHeight);
      
      try{
          //pause program for quarter-sec (in milliseconds)
          Thread.sleep(150);
        }
        catch(InterruptedException e){}
        
        figure1.draw(page);
        
        
        repaint(); //IMPORTANT LINE
   }
}































