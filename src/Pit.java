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
