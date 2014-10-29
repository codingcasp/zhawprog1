package prak05.notenListe;

//package prak03.uhr;


public class NotenListe
{
	private static String[] noten = new String[7];
	
	public NotenListe() {
		noten[0] = "null";
		noten[1] = "eins";
		noten[2] = "zwei";
		noten[3] = "frei";
		noten[4] = "vier";
		noten[5] = "fuenf";
		noten[6] = "sechs";
	}

	/**
	 * Gibt den Text zu einer Zahl zwischen 0 und 6 zurueck.
	 * 
	 * @param zahl
	 * @return
	 */
	public static String gibWerteFuerZahlen(int zahl) {
		// System.out.println("Zahl "+zahl);
		if(zahl >= 0 && zahl <= 6){
			System.out.println(noten[zahl]);
			return noten[zahl];
		} else {
			System.out.println("Ungueltige Zahl "+zahl+". Die Zahl muss zwischen 0 und 6 sein.");
			return "ungueltig";
		}
	}
}
