import java.awt.Color;

/**
 * Tester class to test the code
 * @author sukhvirsingh
 *
 */
public class MancalaTester {

	public static void main(String[] args) {
		Model m = new Model();
		Board b = new RedBoard(m);
		m.attachView(b);
		
	}

}
