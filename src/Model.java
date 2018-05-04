import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Model {

	private int[] smallPits;
	private int[] largePits;
	private int numOfStones;
	private ArrayList<ChangeListener> views;
	
	public Model(){
		smallPits = new int[12];
		largePits = new int[2];
		views = new ArrayList<ChangeListener>();
	}
	
	public int getNumOfStones(){
		return numOfStones;
	}
	
	public void setNumOfStones(int n){
		numOfStones = n;
		for(int i=0; i<12; i++){
			smallPits[i] = numOfStones;
		}
	}
	
	public int[] getSmallPits(){
		return smallPits;
	}
	
	public int[] getLargePits(){
		return largePits;
	}
	
	//i is the small pit user clicked
	public void updateModel(int i){
		smallPits[i] = 0;
		for(ChangeListener l: views){
			l.stateChanged(new ChangeEvent(this));
		}
	}
	
	public void attachView(ChangeListener c){
		views.add(c);
	}
	
	public ArrayList<ChangeListener> getViews(){
		return views;
	}
}
