import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BlackAndWhiteSmallPit extends Pit implements PitStyle{
	
	private int stoneCount;
	
	/**
	 * Constructs a small pit
	 * @param n the number of stones each small pit begins with
	 */
	public BlackAndWhiteSmallPit(int n){
		stoneCount = n;
		setPreferredSize(new Dimension(140, 140));
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D pit = new Ellipse2D.Double(10, 10, 120, 120);
		//made the background black just to give it some style
		setBackground(Color.BLACK);
		g2.setColor(Color.WHITE);
		g2.draw(pit);
		
		int x = 45;
		int y = 45;
		for(int i=0; i<stoneCount; i++){
			Ellipse2D stone = new Ellipse2D.Double(x, y, 10, 10);
			g2.fill(stone);
			x += 15;
			if(x > 100){
				y += 15;
				x = 45;
			}
		}
	}
	
}
