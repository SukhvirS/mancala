import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class RainbowLargePit extends Pit implements PitStyle{

	int stoneCount;

	/**
	 * Constructs a new mancala pit
	 */
	public RainbowLargePit(){
		stoneCount = 0;
		setPreferredSize(new Dimension(100,285));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		//made the background black just to give it some style
		Color[] colors = {Color.BLACK, Color.BLUE, Color.RED,Color.YELLOW, Color.YELLOW, Color.GREEN, Color.PINK};
		Random rand = new Random();
		g2.setColor( colors[rand.nextInt(7)]);
		Ellipse2D pit = new Ellipse2D.Double(10, 5, 80, 275);
		g2.draw(pit);
	}

}
