import javax.swing.JFrame;

public class ExampleViewer
{   
    final static int ANIMATION_TIME_IN_SECONDS = 60;
   
    public static void main(String[] args)throws InterruptedException
   {
      
      JFrame frame = new JFrame();

      frame.setSize(600, 800);
      frame.setTitle("Examples of Components");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RectangleComponent component = new RectangleComponent();
      frame.add(component);
      frame.setVisible(true);
      
      
      FaceComponent face = new FaceComponent();
      frame.add(face);
      frame.setVisible(true);
      
      CircleComponent circle = new CircleComponent(300,400,50);
      frame.add(circle);
      frame.setVisible(true);
      
      
      

      // animate the frame calling.nentFram for each component
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame(seconds);
            circle.nextFrame();
            Thread.sleep( 1000 );
        }
   }
}






