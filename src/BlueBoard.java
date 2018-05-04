import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;
public class BlueBoard extends Board implements BoardColor{
	
	public BlueBoard(Model m){
		super(m);
		changeBoardColor();
		
	@Override
	public void changeBoardColor() {
		this.setColor(Color.BLUE);
		
	}
	}
}
