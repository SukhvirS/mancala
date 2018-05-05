import java.awt.Color;

/**
 * Uses strategy pattern to make a black board
 * @author sukhvirsingh
 *
 */
public class BlackBoard extends Board implements BoardColor{

	/**
	 * Constructs a black board
	 * @param m model to use
	 */
	public BlackBoard(Model m) {
		super(m);
		changeBoardColor();
	}

	/**
	 * Changes the board color to black
	 */
	public void changeBoardColor() {
		this.setColor(Color.BLACK);
	}

}
