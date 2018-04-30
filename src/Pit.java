import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pit extends JPanel{
	
	private int stoneCount;

	public void addStone(){
		stoneCount++;
	}
	
	public int getStoneCount(){
		return stoneCount;
	}
	
	public void removeStones(){
		stoneCount = 0;
	}
	
	public boolean isEmpty(){
		if(stoneCount == 0){
			return true;
		}
		return false;
	}
}
