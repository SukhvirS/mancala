import javax.swing.JPanel;

/**
 * The general class that both SmallPit and LargePit will extend
 * @author sukhvirsingh
 *
 */
public class Pit extends JPanel{
	
	private int stoneCount;

	/**
	 * Adds a stone to this pit
	 */
	public void addStone(){
		stoneCount++;
	}
	
	/**
	 * To get the stone count of this pit
	 * @return
	 */
	public int getStoneCount(){
		return stoneCount;
	}
	
	/**
	 * Removes all stones in this pit
	 */
	public void removeStones(){
		stoneCount = 0;
	}
	
	/**
	 * Checks is pit is empty
	 * @return true or false
	 */
	public boolean isEmpty(){
		if(stoneCount == 0){
			return true;
		}
		return false;
	}

}
