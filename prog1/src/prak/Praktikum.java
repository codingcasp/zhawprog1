package prak;

// prakitkum 02
import prak02.Car;

// prakitkum 03
import prak03.uhr.Nummernanzeige;
import prak03.uhr.Uhrenanzeige;
import prak03.uhr.UhrenanzeigeCrap;
import prak03.event.Artist;
import prak03.event.Event;
import prak03.event.Ticket;

// praktikum 05
import prak05.notenListe.NotenListe;
import prak05.notenListe.Worthaeufigkeitsanalyse;

public class Praktikum {

	public static void main(String[] args) {
		/**
		 * Praktikum 02
		 */
//		Car penisCar = new Car("Chickmagnet", "Revolver", 8, true);
//		penisCar.changeStorageAmount(13);
//		penisCar.changeStorageAmount(10);
//		penisCar.changeStorageAmount(-3);
//		penisCar.outCarInformation();
//		
//		Car pussyCar = new Car("Sexy", "Baby RS", 4.5, true);
//		pussyCar.changeStorageAmount(5);
//		pussyCar.outCarInformation();
//		
//		Car manualCar = pussyCar.inputCar();
//		manualCar.changeStorageAmount(4);
//		manualCar.outCarInformation();
		
		/**
		 * Praktikum 03 - Uhr
		 */
//		Uhrenanzeige uhr = new Uhrenanzeige();
//		for(int i=0; i<1000; i++){
//			uhr.taktsignalGeben();
//			// System.out.println(uhr.gibUhrzeit());
//		}
//
//		UhrenanzeigeCrap uhrCrap = new UhrenanzeigeCrap();
//		for(int i=0; i<1000; i++){
//			uhrCrap.taktsignalGeben();
//			System.out.println(uhrCrap.gibUhrzeit());
//		}
//
//		/**
//		 * Praktikum 03 - Event
//		 */
//		Event myEvent = new Event(new Artist("Michael Jackson", 1000000),
//									new Ticket("VIP", 2000, 200),
//									new Ticket("Tribune", 100, 1000),
//									new Ticket("Stance", 50, 5000)
//		);
//		myEvent.setEventTitle("Superevent by Jones Event Company");
//		myEvent.buyTickets("VIP",50);
//		myEvent.buyTickets("Tribune", 100);
//		myEvent.buyTickets("Stance", 1000);
//		myEvent.printData();


        /**
         * Praktikum 05 - Noten Liste
         */
        NotenListe noten_liste = new NotenListe();
        noten_liste.gibWerteFuerZahlen(0);
        noten_liste.gibWerteFuerZahlen(1);
        noten_liste.gibWerteFuerZahlen(2);
        noten_liste.gibWerteFuerZahlen(3);
        noten_liste.gibWerteFuerZahlen(4);
        noten_liste.gibWerteFuerZahlen(5);
        noten_liste.gibWerteFuerZahlen(6);
        System.out.println("===========");
        
        /**
         * Praktikum 05 - Worthaeufigkeitsanalyse
         */
        Worthaeufigkeitsanalyse hauefigkeitsanalyse = new Worthaeufigkeitsanalyse();
    	hauefigkeitsanalyse.verarbeiteText("Fritz sagt: \"Die Softwareentwicklung ist meine Leidenschaft!\"");
    	hauefigkeitsanalyse.verarbeiteText("Hans meint, er teile die Leidenschaft mit Fritz.");
    	hauefigkeitsanalyse.verarbeiteText("John fuegt hinzu, dass die Softwareentwicklung nicht nur aus Programmieren bestehe, sondern es sich dabei um einen komplexen Prozess, bestehend aus vielen kleinen Komponenten, handelt.\"");
    	hauefigkeitsanalyse.druckeStatistik();

	}
}
