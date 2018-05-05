import java.awt.Color;

/**
 * Tester class to test the code
 * @author sukhvirsingh
 *
 */
public class MancalaTest {

	public static void main(String[] args) {
		Model m = new Model();
		Board b = new Board(m);
		m.attachView(b);
		
	}

}
