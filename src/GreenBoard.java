import java.awt.Color;

/**
 * Uses strategy pattern to make a green board
 * @author sukhvirsingh
 *
 */
public class GreenBoard extends Board implements BoardColor{

	/**
	 * Constructs a green board
	 * @param m model to use
	 */
	public GreenBoard(Model m){
		super(m);
		changeBoardColor();
	}

	/**
	 * Changes board color to green
	 */
	public void changeBoardColor() {
		this.setColor(Color.GREEN);
		
	}
	
}
