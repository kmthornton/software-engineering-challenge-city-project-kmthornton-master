//Kyle Thornton

import java.awt.*;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class Building implements Runnable
{
    private int baseX;
    private int baseY;
    private Color color;
    private int height;
    private ArrayList <Window> windows;
    
    public Building(int center, int bottom, Color shade, int size)
    {
        baseX = center;
        baseY = bottom;
        color = shade;
        height = size;
    }
    
    public void draw(Graphics page)
    {
        int top = baseY - height; //top of building
        int x=0;
        int y = -35;
        page.setColor(color);
        
        //top part of building
        page.fillRect(baseX-10, top, 200, 350);
        
        
        windows = new ArrayList<Window>();
            for(int j = 0; j<36; j++)
            {
                if(j%6 != 0)
                {x+=34;}
                else
                {   x=0;
                    y+=50;
                }
                windows.add(new Window(baseX+x,top+y, Color.black));
            }
            for(int i = 0; i<36; i++)
              {windows.get(i).draw(page);}
              
    } 
        
    public void run()
    { while(true)
        {
            Color windowcol = Color.black;
            Random rand = new Random();
            int top = baseY - height; //top of building
            int x=0;
            int y = -35;
                int windowcount = 0;
                while(windowcount != 36)
                {
                    int randwind=rand.nextInt(36);
                    for(int i = 0; i<36; i++)
                    {
                        if(i==randwind)
                        {
                            //windows.remove(windows.get(i));
                            //windows.get(i).change(Color.yellow);
                            windowcol = Color.yellow;
                            windowcount+=1;
                        }
                    }
                }
            
            try{
                Thread.sleep(17);
            }catch ( Exception e){}
            System.out.print(windowcol);
            
        }
    }
        
}








