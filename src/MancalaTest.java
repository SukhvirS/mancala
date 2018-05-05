import java.awt.Color;

/**
 * Tester class to test the code
 * @author sukhvirsingh
 *
 */
public class MancalaTest {

	public static void main(String[] args) {
		Model m = new Model();
		Board b = new RedBoard(m);
		m.attachView(b);
		
	}

}
