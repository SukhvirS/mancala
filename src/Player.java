public class player {
	private String name;
	private int score;
	
	//constructs player
	public player(String name, int score) {
		this.name = name;
		this.score = score;	
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return "Player{" + "name =" + name + ", score ='" + score + '\'' + '}';
	}
}
