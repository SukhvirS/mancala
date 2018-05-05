import java.awt.Color;

/**
 * Uses strategy pattern to make a red board
 * @author sukhvirsingh
 *
 */
public class RedBoard extends Board implements BoardColor{

	/**
	 * Constructs a red board
	 * @param m model to use
	 */
	public RedBoard(Model m){
		super(m);
		changeBoardColor();
	}

	/**
	 * Changes board color red
	 */
	public void changeBoardColor() {
		this.setColor(Color.RED);
		
	}
	
}
