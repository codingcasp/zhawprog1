package prak05.notenListe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Zaehlt die Anzahl Vorkommnisse von Woertern ueber mehrere Zeichenketten.
 * Es lassen sich eine beliebige Anzahl an Zeichenketten uebergeben. Die
 * Statistik wird fortlaufend gefuehrt. Die Wortzaehlung laesst sich jederzeit
 * ausgeben. Die Satzeichen . , ? ! " : ; werden entfernt. Alle Buchstaben
 * werden in Kleinbuchstaben umgewandelt um beispielsweise das Wort 'die'
 * inmitten eines Satzes und das Wort 'Die' am Anfang eines Satzes als gleiches
 * Wort werten zu koennen.
 * 
 * @version 1.0
 * @author XXXX
 */
public class Worthaeufigkeitsanalyse {
	private static String stringErsetzen = ".,?!\":;";
	
	static Character[] zeichenErsetzen = new Character[7];
	static String[] wortListe;
	static Map<String, Integer> wortStatistik = new HashMap<String, Integer>();
	
	
	static {
		for(int i = 0; i < stringErsetzen.length(); i++){
			zeichenErsetzen[i] = stringErsetzen.charAt(i);
		}
	}
	
	/**
	 * Constructor
	 */
	public Worthaeufigkeitsanalyse() {
		wortListe = null;
		// TODO Auto-generated method stub
	}

	/**
	 * Verarbeitet einen String, setzt die bestehende wortListe auf null
	 * @param string
	 */
	public void verarbeiteText(String string) {
		wortListe = null;
		erzeugeStatistik(string);
	}
	
	/**
	 * Erzeugt einen println der Statistik
	 */
	public void druckeStatistik() {
		Iterator it = wortStatistik.entrySet().iterator();
		while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        System.out.println(pairs.getKey() + " = " + pairs.getValue());
	        it.remove();
	    }
	}
	
	/**
	 * Teilt den String anhand von Leerzeichen (elemeniert Sonderzeichen)
	 * @param string
	 */
	private void erzeugeStatistik(String string){
		wortListe = string.split("\\s+");
		eliminiereSonderzeichen();
	}
	
	
	/**
	 * Eliminiert Sonderzeichen aus den Worten
	 * @param string
	 * @return
	 */
	private void eliminiereSonderzeichen() {
		for (String wort:wortListe) {
			String wortClean = wort.toLowerCase();
			for(Character zeichen:zeichenErsetzen) {
				wortClean = wortClean.replace(zeichen.toString(), "");
			}
			//System.out.println(wortClean);
			fuegeWortAn(wortClean);
		}
	}
	
	/**
	 * Fuegt ein Wort an die bestehende wortStastik an. Erzeugt ein neues Element
	 * in der Hash Map, wenn das Wort noch nicht gefunden wurde.
	 * @param wort
	 */
	private void fuegeWortAn(String wort) {
		if(wortStatistik.get(wort) == null) {
			wortStatistik.put(wort, 1);
		} else {
			wortStatistik.put(wort, wortStatistik.get(wort) + 1);
		}
	}
}
