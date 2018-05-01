import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

public class BlackAndWhiteLargePit extends Pit implements PitStyle{
	
	int stoneCount;

	/**
	 * Constructs a new mancala pit
	 */
	public BlackAndWhiteLargePit(){
		stoneCount = 0;
		setPreferredSize(new Dimension(100,285));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		//made the background black just to give it some style
		setBackground(Color.BLACK);
		g2.setColor(Color.WHITE);
		Ellipse2D pit = new Ellipse2D.Double(10, 5, 80, 275);
		g2.draw(pit);
	}

}
