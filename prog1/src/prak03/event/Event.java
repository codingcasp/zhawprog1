package prak03.event;

public class Event {
	
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
	
}

