import java.awt.Color;

public class BlueBoard extends Board implements BoardColor{
	
	public BlueBoard(Model m){
		super(m);
		changeBoardColor();
	}
		
	@Override
	public void changeBoardColor() {
		this.setColor(Color.BLUE);
		
	}
	
}
