import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board extends JFrame {

	private Model model;
	private ArrayList<Pit> playerA_row;
	private ArrayList<Pit> playerB_row;
	private Pit playerA_mancala;
	private Pit playerB_mancala;
	private Color color;
	boolean stonesNumSelected;
	boolean colorSelected;
	
	public Board(Model m, Color c){
		model = m;
		color = c;
		
		stonesNumSelected = false;
		colorSelected = false;
		
		makeStartScreen();
		drawBoard();
	}
	
	public void makeStartScreen(){
		
		//start screen
		JDialog startScreen = new JDialog();		//JDialog waits for the user input
		startScreen.setTitle("Mancala");
		startScreen.setModal(true);
		startScreen.setSize(600, 175);
		startScreen.setResizable(false);
		startScreen.setLayout(new FlowLayout());
		
		//ask for stones
		JPanel stonesSelectPanel = new JPanel();
		JLabel selectLabel = new JLabel("Select how many stones you would like:");
		stonesSelectPanel.add(selectLabel);
		//three stones
		JButton threeStonesButton = new JButton("3");
		threeStonesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model.setNumOfStones(3);
				stonesNumSelected = true;
			}
		});
		//four stones
		JButton fourStonesButton = new JButton("4");
		fourStonesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model.setNumOfStones(4);
				stonesNumSelected = true;
			}
		});
		stonesSelectPanel.add(threeStonesButton);
		stonesSelectPanel.add(fourStonesButton);
		
		//color panel
		JPanel colorSelectPanel = new JPanel();
		JLabel colorSelectLabel = new JLabel("Select the color of the board:");
		colorSelectPanel.add(colorSelectLabel);	
		JButton redButton = new JButton("Red");
		redButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				setColor(Color.RED);
				colorSelected = true;
			}
		});	
		JButton greenButton = new JButton("Green");
		greenButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				setColor(Color.GREEN);
				colorSelected = true;
			}
		});	
		JButton blueButton = new JButton("Blue");
		blueButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				setColor(Color.BLUE);
				colorSelected = true;
			}
		});
		JButton blackButton = new JButton("Black");
		blackButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				setColor(Color.BLACK);
				colorSelected = true;
			}
		});
		colorSelectPanel.add(redButton);
		colorSelectPanel.add(greenButton);
		colorSelectPanel.add(blackButton);
		colorSelectPanel.add(blueButton);
		
		JPanel startButtonPanel = new JPanel();
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(colorSelected && stonesNumSelected){
					startScreen.dispose();
				}
			}
		});
		startButtonPanel.add(startButton);
		
		startScreen.add(stonesSelectPanel);
		startScreen.add(colorSelectPanel);
		startScreen.add(startButtonPanel);
		
		startScreen.setVisible(true);
		startScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void drawBoard(){
		
		setSize(1000,350);
		setLayout(new BorderLayout(10, 0));		//border layout with 10 horizontal padding between section
		setResizable(false);
		
		//left pit
		Pit leftPit = new LargePit(color);
		add(leftPit, BorderLayout.WEST);

		//center panel of 12 small pits
		JPanel smallPits = new JPanel();
		smallPits.setLayout(new GridLayout(2,6));
		for(int i=0; i<12; i++){
			Pit p = new SmallPit(model.getNumOfStones(), color);
			smallPits.add(p);
		}
		add(smallPits, BorderLayout.CENTER);
		
		//right pit
		Pit rightPit = new LargePit(color);
		add(rightPit, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void setColor(Color c){
		color = c;
	}
	
	public ArrayList<Pit> getPlayerAPits(){
		return playerA_row;
	}

	public ArrayList<Pit> getPlayerBPits(){
		return playerB_row;
	}
	

	public Pit getPlayerAMancala(){
		return playerA_mancala;
	}


	public Pit getPlayerBMancala(){
		return playerB_mancala;
	}
	
}
