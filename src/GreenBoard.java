import java.awt.Color;

public class GreenBoard extends Board implements BoardColor{

	public GreenBoard(Model m){
		super(m);
		changeBoardColor();
	}

	@Override
	public void changeBoardColor() {
		this.setColor(Color.GREEN);
		
	}
	
}
