
//Kyle Thornton
//Fri 23 2018

import java.applet.Applet;
import java.awt.*;

public class Background extends Applet
{
    private final int APPLET_WIDTH = 1300;
    private final int APPLET_HEIGHT = 600;
    private final int HEIGHT_MIN = 500;
    private final int VARIANCE = 45;
    
    private Building build1, build2, build3, build4;
    private Color sky = new Color (255, 215, 118);
    private Color ground = new Color (228,75,29);
    
    

    
    public void init()
    {
        build1 = new Building(100, 150, Color.white, 100);
        build2 = new Building(350, 150, Color.white, 100);
        build3 = new Building(700, 150, Color.white, 100);
        build4 = new Building(950, 150, Color.white, 100);
        
     
        
        Thread t1 = new Thread(build1);
        
        t1.start();
        Thread t2 = new Thread(build2);
        t2.start();
        Thread t3 = new Thread(build3);
        t3.start();
        Thread t4 = new Thread(build4);
        t4.start();
        setBackground(sky);
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }
    public void paint(Graphics g)
    {
        g.setColor(ground);
        g.fillRect(0,400,APPLET_WIDTH, APPLET_HEIGHT);
        g.fillOval(1200,50,50,50);
        
        build1.draw(g);
        build2.draw(g);
        build3.draw(g);
        build4.draw(g);
        
        try{
        Thread.sleep(100);
        }
        catch(InterruptedException e){}
        
        build1.draw(g);
        //setBackground(Color.black);
        //g.setColor(Color.white);
        //g.fillOval(1200,50,50,50);
        
        
        repaint();
        
    }
}