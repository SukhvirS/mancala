import java.awt.Graphics;

public interface PitStyle {
	
	//returns shape of pits
	public RectangularShape getPitShape();
	
	//returns shape of mancalapits
	public RectangularShape getMancalaPitShape();
	
	// returns correct position of stone in pit
	public RectangularShape getStoneShape(int num, boolean isMancala);
	void paintComponent(Graphics g);
}
