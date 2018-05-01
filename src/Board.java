import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board extends JFrame {

	private Model model;
	private ArrayList<Pit> playerA_row;
	private ArrayList<Pit> playerB_row;
	private LargePit playerA_mancala;
	private LargePit playerB_mancala;
	
	public Board(Model m){
		model = m;
		
		//start screen
		JDialog startScreen = new JDialog();		//JDialog waits for the user input
		startScreen.setModal(true);
		startScreen.setSize(300, 200);
		startScreen.setLayout(new BorderLayout());
		JLabel title = new JLabel("Mancala");
		title.setPreferredSize(new Dimension(100, 10));
		title.setHorizontalAlignment(JLabel.CENTER);
		startScreen.add(title, BorderLayout.NORTH);
		//three stones
		JPanel selectionPanel = new JPanel();
		JLabel selectLabel = new JLabel("Select how many stones you would like:");
		selectionPanel.add(selectLabel);
		JButton threeStonesButton = new JButton("3");
		threeStonesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model.setNumOfStones(3);
				startScreen.dispose();
			}
		});
		//four stones
		JButton fourStonesButton = new JButton("4");
		fourStonesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model.setNumOfStones(4);
				startScreen.dispose();
			}
		});
		selectionPanel.add(threeStonesButton);
		selectionPanel.add(fourStonesButton);
		startScreen.add(selectionPanel, BorderLayout.CENTER);
		startScreen.setVisible(true);
		startScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		drawBoard();
	}
	
	public void drawBoard(){
		
		setSize(1000,350);
		setLayout(new BorderLayout(10, 0));		//border layout with 10 horizontal padding between section
		setResizable(false);
		getContentPane().setBackground(Color.BLACK);
		
		//left pit
		Pit leftPit = new LargePit();
		add(leftPit, BorderLayout.WEST);

		//center panel of 12 small pits
		JPanel smallPits = new JPanel();
		smallPits.setLayout(new GridLayout(2,6));
		for(int i=0; i<12; i++){
			Pit p = new RainbowSmallPit(model.getNumOfStones());
			smallPits.add(p);
		}
		add(smallPits, BorderLayout.CENTER);
		
		//right pit
		Pit rightPit = new LargePit();
		add(rightPit, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public ArrayList<Pit> getPlayerAPits(){
		return playerA_row;
	}

	public ArrayList<Pit> getPlayerBPits(){
		return playerB_row;
	}
	

	public LargePit getPlayerAMancala(){
		return playerA_mancala;
	}


	public LargePit getPlayerBMancala(){
		return playerB_mancala;
	}
	
	public static void main(String[] args){
		Model m = new Model();
		Board b = new Board(m);
	}
	
}
