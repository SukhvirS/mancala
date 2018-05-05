import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Holds all of the board data
 * @author sukhvirsingh
 *
 */
public class Model {

	private int[] smallPits;
	private int[] largePits;
	private int numOfStones;
	private ArrayList<ChangeListener> views;
	/*int undoCounter;
	boolean undoAllowed;
	boolean freeTurn;
	int [] data;
	static int Player = 1;
	int previousPlayer = 2;
	*/
	
	/**
	 * Constructs a new model with 12 small pits and 2 large pits
	 */
	public Model(){
		smallPits = new int[12];
		largePits = new int[2];
		largePits[0] = 0;
		largePits[1] = 0;
		views = new ArrayList<ChangeListener>();
		//freeTurn = false;
		//undoAllowed = false;
		//undoCounter = 3;
	}
	
	/**
	 * To get number of stones the user selected
	 * @return
	 */
	public int getNumOfStones(){
		return numOfStones;
	}
	
	/**
	 * To set number of stones in each pit
	 * @param n
	 */
	public void setNumOfStones(int n){
		numOfStones = n;
		for(int i=0; i<12; i++){
			smallPits[i] = numOfStones;
		}
	}
	
	/*
	public void undo(){
		if(!undoAllowd){
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "You are not allowed to undo!");
		}
		undo = true;
		undoCounter--;
		if(freeTurn){
			Player++;
			Player = ((player % 2) ! = 0) ? 1 : 0;
			freeTurn = false;
		}
		if(undoCounter ! = 0){
			
		}
		undoAllowed = false;
		updateModel();
		
	}*/
	
	/**
	 * To get all the small pits
	 * @return
	 */
	public int[] getSmallPits(){
		return smallPits;
	}
	
	/**
	 * To get all the large pits
	 * @return
	 */
	public int[] getLargePits(){
		return largePits;
	}
	
	/*
	public int getUndoCounter(){
		return undoCounter;
	}
	
	public int [] getData(){
		return data;
	}
	*/
	
	/**
	 * Updates the model
	 * @param i the small pit the user clicked on
	 */
	public void updateModel(int i){
		int startPit = i;
		int count = smallPits[i];
		smallPits[i] = 0;
		while(count >  0){
			//top row
			if(i<=5){
				//if user reaches his own mancala on his turn, add a stone to his mancala
				if(i==0 && startPit<6){
					largePits[0]++;
					i=6;
					count--;
				}
				else if(i==0 && startPit>=6){
					i=6;
					smallPits[i]++;
				}
				else{
					i--;
					smallPits[i]++;
				}
			}
			//bottom row
			else{
				//if user reaches his own mancala on his turn, add a stone to his mancala
				if(i==11 && startPit >= 6){
					largePits[1]++;
					i=5;
					count--;
				}
				else if(i==11 && startPit < 6){
					i=5;
					smallPits[i]++;
				}
				else{
					i++;
					smallPits[i]++;
				}
			}
			count--;
		}
		//notify all views of state change
		for(ChangeListener l: views){
			l.stateChanged(new ChangeEvent(this));
		}
	}
	
	/**
	 * Attach a view to this model
	 * @param c
	 */
	public void attachView(ChangeListener c){
		views.add(c);
	}
	
	/**
	 * Get all views attached to this model
	 * @return
	 */
	public ArrayList<ChangeListener> getViews(){
		return views;
	}
}
