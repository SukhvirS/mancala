import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;
public class BlueBoard extends Board implements BoardStyle{
	
	public BlueBoard(Model m){
		super(m);
		changeBoardColor();
	
	   final static int PIT_WIDTH = 100;
	   final static int PIT_HEIGHT = 100;
	   final static int MAN_WIDTH = 100;
	   final static int MAN_HEIGHT = 160;
	   final static int STONE_WIDTH = 10;
	   final static int STONE_HEIGHT = 10;
	
	   public RectangularShape getPitShape()
	   {
		   return new Ellipse2D.Double(0, 0, PIT_WIDTH, PIT_HEIGHT);
	   }
	
	   public RectangularShape getMancalaShape()
	   {
		   return new Ellipse2D.Double(0, 0, MAN_WIDTH, MAN_HEIGHT);
	   }
	   /*
	    * param num number of stones in pits
	    * param isMancala if its in mancala pit
	    */
	   public RectangularShape getStoneShape(int num, boolean isMancala)
	   {
		   double x = 0;
		   double y = 0;
		   if(isMancala)
		   {
			   x += (double) MAN_WIDTH / 2 - (double) STONE_WIDTH / 2;
		       y += (double) MAN_HEIGHT / 2 - (double) STONE_HEIGHT / 2;
		   }
		   else
		   {
			   x += (double) PIT_WIDTH / 2 - (double) STONE_WIDTH / 2;
		       y += (double) PIT_HEIGHT / 2 - (double) STONE_HEIGHT / 2;
		   }
		   
		   return new Rectangle2D.Double(x, y, STONE_WIDTH, STONE_HEIGHT);
	   }
	   //paint blue board
	   public Color getBoardColor()
	   {
	      return new Color(0, 0, 255);
	   }
	   
	   public Color getStoneColor()
	   {
	      return Color.BLACK;
	   }
	   //paint purple pit color 
	   public Color getPitColor()
	   {
	      return new Color(160, 32, 240);
	   }
	   
	   public int getMancalaW()
	   {
		   return MAN_WIDTH;
	   }
	  
	   public int getMancalaH()
	   {
		   return MAN_HEIGHT;
	   }
	   
	   public int getPitW()
	   {
		   return PIT_WIDTH;
	   }
	   
	   public int getPitH()
	   {
		   return PIT_HEIGHT;
	   }

}
	

	@Override
	public void changeBoardColor() {
		this.setColor(Color.BLUE);
		
	}

}
