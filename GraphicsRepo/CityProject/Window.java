import java.awt.*;
import java.util.*;

public class Window
{
    private int baseX;
    private int baseY;
    private Color color;
    
    public Window(int center, int bottom, Color shade)
    {
        baseX = center;
        baseY = bottom;
        color = shade;
    }
    
    public void draw(Graphics page)
    {
        page.setColor(color);
        
        
        page.fillRect(baseX,baseY, 10, 40);
        
    }
    
    public void change(Color shade)
    {
        color = shade;
    }
}