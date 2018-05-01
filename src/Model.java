import java.util.ArrayList;

import javax.swing.event.ChangeListener;

public class Model {

	private int[] stones;
	private int numOfStones;
	private ArrayList<ChangeListener> views;
	
	public Model(){
		stones = new int[12];
	}
	
	public int getNumOfStones(){
		return numOfStones;
	}
	
	public void setNumOfStones(int n){
		numOfStones = n;
		for(int i=0; i<12; i++){
			stones[i] = numOfStones;
		}
	}
	
	public int[] getStones(){
		return stones;
	}
	
	public void attachView(ChangeListener c){
		views.add(c);
	}
	
	public ArrayList<ChangeListener> getViews(){
		return views;
	}
}
