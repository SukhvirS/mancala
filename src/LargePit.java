import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class LargePit extends Pit{

	private int stoneCount;
	private Color color;
	
	public LargePit(Color c){
		stoneCount = 0;
		color = c;
		setPreferredSize(new Dimension(100,285));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		Ellipse2D pit = new Ellipse2D.Double(10, 5, 80, 275);
		g2.draw(pit);
	}
}
