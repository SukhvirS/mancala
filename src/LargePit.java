import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * The large (Mancala) pit
 * @author sukhvirsingh
 *
 */
public class LargePit extends Pit{

	private int stoneCount;
	private Color color;
	
	/**
	 * Constructs a large (Mancala) pit
	 * @param n number of stones in the pit
	 * @param c color of pit
	 */
	public LargePit(int n, Color c){
		stoneCount = n;
		color = c;
		setPreferredSize(new Dimension(100,350));
	}
	
	/**
	 * Draws the pit
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(color);
		Ellipse2D pit = new Ellipse2D.Double(10, 5, 80, 275);
		g2.draw(pit);
		
		int x = 35;
		int y = 20;
		for(int i=0; i<stoneCount; i++){
			Ellipse2D stone = new Ellipse2D.Double(x, y, 10, 10);
			g2.fill(stone);
			y += 15;
			if(y > 250){
				x = 50;
				y = 20;
			}
		}
	}
	
}
