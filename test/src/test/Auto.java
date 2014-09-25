package test;

public class Auto {
	
	private static final Exception MarkeNotCoolException = null;
	private String marke;
	private String typ;
	private double hubraum;
	private boolean hasTurbo;
	
	private int bestand;
	
	
	public Auto (String marke, String typ, double hubraum, boolean hasTurbo){
		
		this.marke = marke;
		this.typ = typ;
		this.hubraum = hubraum;
		this.hasTurbo = hasTurbo;
		
	}


	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		if(marke.length() > 10 || marke.length() < 3){
			if (this.marke == null) {
				this.marke = "___";
				System.out.println("Marke: "+marke+" ungültig. Marke muss 3 bis maximal 10 Zeichen sein. ");
			}
			else
				System.out.println("Marke: "+marke+" ungültig, alter Wert beibehalten. Marke muss 3 bis maximal 10 Zeichen sein. ");

		}
		else 
			this.marke = marke;
	}


	public String getTyp() {
		return typ;
	}


	public void setTyp(String typ) {
		if(typ.length() > 10 || typ.length() < 3){
			if (this.typ == null) {
				this.typ = "___";
				System.out.println("Typ: "+typ+" ungültig. Typ muss 3 bis maximal 10 Zeichen sein. ");
			}
			else 
				System.out.println("Typ: "+typ+" ungültig. Alter Wert beibehalten. Typ muss 3 bis maximal 10 Zeichen sein. ");

			
			
		}
		else 
			this.typ = typ;
	}


	public double getHubraum() {
	
		return hubraum;
	}


	public void setHubraum(double hubraum) {
		if (hubraum<0.5 || hubraum > 8) {
			if (hubraum==0) {
				this.hubraum = 0;
				System.out.println("Hubraum "+hubraum+" ungültig. Hubraum zwischen 0.5 und 8 Litern angeben");
			}
			else 
				System.out.println("Hubraum "+hubraum+" ungültig, alter Wert beibelassen. Hubraum zwischen 0.5 und 8 Litern angeben");

				
		}
		else 
			this.hubraum = hubraum;
	}


	public boolean isHasTurbo() {
		return hasTurbo;
	}


	public void setHasTurbo(boolean hasTurbo) {
		
		this.hasTurbo = hasTurbo;
	}
	
	public int getBestand() {
		return this.bestand;
	}
	
	public void aendereBestand(int veraenderung) {
		if (veraenderung < -10 || veraenderung > 10) {
			System.out.println("Zu grosse veränderung, gültiger bereich von -10 bis +10");
		}
		else {
			String outMsg = "";
			outMsg = "Bestand verändert. Alter Bestand : "+this.bestand;
		
			this.bestand += veraenderung;
			outMsg = outMsg + " Neuer Bestand : "+this.bestand;
			System.out.println(outMsg);
		}
	}
	
	public void druckeAutoInfo() {
		String outline1;
		String outline2;
		String outline3;
		outline1 = this.marke + " " + this.typ + ", " + this.hubraum + " Liter";
		outline2 = "Code: "+this.marke.substring(0, 3) + "-"+this.typ.substring(0,3) + "-"+this.hubraum;
		if(this.hasTurbo) {
			outline1 = outline1 + " turbo";
			outline2 = outline2 + "-t";
		outline3 = "Lagerbestand: "+this.bestand;
		
		System.out.println(outline1 + "\n" + outline2 + "\n" + outline3);
		
		}
	}
}
