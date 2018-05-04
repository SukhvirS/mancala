import java.awt.Color;

public class RedBoard extends Board implements BoardColor{

	public RedBoard(Model m){
		super(m);
		changeBoardColor();
	}

	@Override
	public void changeBoardColor() {
		this.setColor(Color.RED);
		
	}
	
}
