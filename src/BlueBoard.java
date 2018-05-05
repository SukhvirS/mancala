import java.awt.Color;

/**
 * Uses strategy pattern to make a blue board
 * @author sukhvirsingh
 *
 */
public class BlueBoard extends Board implements BoardColor{
	
	/**
	 * Constructs a blue board
	 * @param m model to use
	 */
	public BlueBoard(Model m){
		super(m);
		changeBoardColor();
	}
		
	/**
	 * Changes the board color to blue
	 */
	public void changeBoardColor() {
		this.setColor(Color.BLUE);
		
	}
	
}
