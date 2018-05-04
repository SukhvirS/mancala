import java.awt.Graphics;

public interface PitStyle {
	
	//returns shape of pits
	public RectangularShape getPitShape();
	
	//returns shape of mancalapits
	public RectangularShape getMancalaPitShape();
	
	// returns correct position of stone in pit
	public RectangularShape getStoneShape(int num, boolean isMancala);
	
	public int getPitW();
	public int getPitH();
	
	public int getMancalaW();
	public int getMancalaH();
	void paintComponent(Graphics g);
}
