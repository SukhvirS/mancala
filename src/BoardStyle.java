import java.awt.Color;
public interface BoardStyle
{
   /**
    * returns shape of pit
    */
	public RectangularShape getPitShape();
	
	/**
	 * returns shape of mancala
	 */
	public RectangularShape getMancalaShape();
	
	/**
	 * returns shape of stone in correct position and number of stones
	 */
	public RectangularShape getStoneShape(int num, boolean isMancala);
	
	/**
	 * returns color of the board
	 */
	public Color getBoardColor();
	
	/**
	 * returns color of the stone
	 */
	public Color getStoneColor();
	
	/**
	 * returns color of the pit
	 */
	public Color getPitColor();


   /**
    * returns width of mancala
    */
   public int getMancalaW();
   
   /**
    * returns height of mancala
    */
   public int getMancalaH();
   
   /**
    * returns width of pit
    */
   public int getPitW();
   
   /**
    * returns height of pit
    */
   public int getPitH();
}
