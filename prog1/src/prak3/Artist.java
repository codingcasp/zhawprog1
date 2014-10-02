package prak3;

public class Artist {

	private String name;
	private int fee;
	
	public Artist(String name, int fee) {
		this.name = name;
		this.fee = fee;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
}
