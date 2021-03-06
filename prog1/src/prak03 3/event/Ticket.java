package prak03.event;

public class Ticket {
	
	String category;
	int price;
	int available;
	int sold;
	
	
	public Ticket(String category, int price, int available) {
		super();
		this.category = category;
		this.price = price;
		this.available = available;
		this.sold = 0;
	}
	
	public int buyTicket(int amount){
		if(this.available >= amount) {
			int total_price = amount * this.price;
			this.sold = this.sold + amount;
			this.available = this.available - amount;
			System.out.println("Bought " + amount + " tickets for CHF " + total_price + ".");
			
			return total_price;
		} else {
			System.out.println("Can not buy " + amount + " tickets. Only " + this.available + " '" + this.category + "' tickets available.");
			return 0;
		}
	}
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}

	
	
	

}
