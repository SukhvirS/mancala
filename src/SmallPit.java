import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class SmallPit extends Pit{

	private int stoneCount;
	private Color color;
	
	public SmallPit(int n, Color c){
		stoneCount = n;
		color = c;
		setPreferredSize(new Dimension(133, 175));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D pit = new Ellipse2D.Double(10, 10, 120, 120);
		
		g2.setColor(color);
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
