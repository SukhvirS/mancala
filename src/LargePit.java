import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

public class LargePit extends Pit{
	
	int stoneCount;

	/**
	 * Constructs a new mancala pit
	 */
	public LargePit(){
		stoneCount = 0;
		setPreferredSize(new Dimension(100,285));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		Ellipse2D pit = new Ellipse2D.Double(10, 5, 80, 275);
		g2.draw(pit);
	}

	public static void main(String[] args){
		JFrame f = new JFrame();
		f.setSize(500, 400);
		f.setLayout(new BorderLayout());
		Pit p = new LargePit();
		f.add(p, BorderLayout.WEST);
		p.setPreferredSize(new Dimension(80, 350));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
