import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame {

	private ArrayList<Pit> playerA_row;
	private ArrayList<Pit> playerB_row;
	private Pit playerA_mancala;
	private Pit playerB_mancala;
	
	public Board(int n){
		setSize(1000,350);
		setLayout(new BorderLayout(10, 0));		//border layout with 10 horizontal padding between section
		setResizable(false);
		
		//left pit
		Pit leftPit = new LargePit();
		add(leftPit, BorderLayout.WEST);

		//center panel of 12 small pits
		JPanel smallPits = new JPanel();
		smallPits.setLayout(new GridLayout(2,6));
		for(int i=0; i<12; i++){
			Pit p = new SmallPit(n);
			smallPits.add(p);
		}
		add(smallPits, BorderLayout.CENTER);
		
		//right pit
		Pit rightPit = new LargePit();
		add(rightPit, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public ArrayList<SmallPit> getPlayerAPits(){
		return playerA_row;
	}

	public ArrayList<SmallPit> getPlayerBPits(){
		return playerB_row;
	}
	

	public LargePit getPlayerAMancala(){
		return playerA_mancala;
	}


	public LargePit getPlayerBMancala(){
		return playerB_mancala;
	}
	
	public static void main(String[] args){
		Board b = new Board(10);
	}
	
}
