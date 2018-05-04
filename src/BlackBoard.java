import java.awt.Color;

public class BlackBoard extends Board implements BoardColor{

	public BlackBoard(Model m) {
		super(m);
		changeBoardColor();
	}

	@Override
	public void changeBoardColor() {
		this.setColor(Color.BLACK);
	}

}
