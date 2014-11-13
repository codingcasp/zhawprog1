package prak03.event;

public class Event {
	private String eventName;
	private Artist artist;
	private Ticket ticketVIP;
	private Ticket ticketTribune;
	private Ticket ticketStance;
	
	
	public Event() {
		
		//do nothing... bitch
	};
	
	public Event(Artist artist, Ticket VIP, Ticket tribune,  Ticket stance) {
		this.artist = artist;
		
		ticketVIP = VIP;
		ticketTribune = tribune;
		ticketStance = stance;;
	}

	public Event(String artistName, int artistFee, int availableVIP, int priceVIP, 
									int availableTribune, int priceTribune,
									int availableStance, int priceStance) {
		
		this(new Artist(artistName, artistFee), 
			 new Ticket("VIP", availableVIP, priceVIP),
			 new Ticket("Tribune", availableTribune, priceTribune),
			 new Ticket("Stance", availableStance, priceStance)
		);
		
	}
	
	public void setArtist(Artist newArtist) {
		artist = newArtist;		
	}
	
	public void setEventTitle(String newTitle) {
		eventName = newTitle;
	}
	
	
	public void printData(){
		System.out.println("penis");
		System.out.println("Information for Event : >"+this.eventName+"<");
		System.out.println("Artist :"+artist.getName() + ", is paid  "+artist.getFee()+"Tons of Gold");
		System.out.println("VIP Tickets "+ticketVIP.getSold()+" of "+ticketVIP.getAvailable()+" sold.");
		System.out.println("Tribune Tickets "+ticketTribune.getSold()+" of "+ticketTribune.getAvailable()+" sold.");
		System.out.println("Stance Tickets "+ticketStance.getSold()+" of "+ticketStance.getAvailable()+" sold.");
		int totalIncome = (	ticketVIP.getSold()*ticketVIP.getPrice()  +
							ticketTribune.getSold()*ticketTribune.getPrice() +
							ticketStance.getSold()*ticketStance.getPrice() 
						  );
							
		System.out.println("Total Income" + totalIncome);
		if(totalIncome > artist.getFee()) {
			System.out.println("Earnings" + (totalIncome - artist.getFee()) );
		}
		else {
			System.out.println("Losses : " + (artist.getFee() - totalIncome ) ); 
		}
		
		
		
	};
	
	
	public void buyTickets(String category, int amount) {
		switch(category) {
		case "VIP" : ticketVIP.buyTicket(amount);
		case "Tribune" : ticketTribune.buyTicket(amount);
		case "Stance" : ticketStance.buyTicket(amount);
		}
		
		
	}
	
}

