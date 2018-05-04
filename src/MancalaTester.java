import java.awt.Color;

public class MancalaTester {

	public static void main(String[] args) {
		Model m = new Model();
		Board b = new Board(m);
		m.attachView(b);
		
	}

}
