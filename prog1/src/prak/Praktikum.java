package prak;

// prakitkum 01
import prak02.Car;

// prakitkum 02
import prak03.Nummernanzeige;
import prak03.Uhrenanzeige;
import prak03.UhrenanzeigeCrap;

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
		 * Praktikum 03
		 */
		Uhrenanzeige uhr = new Uhrenanzeige();
		for(int i=0; i<1000; i++){
			uhr.taktsignalGeben();
			// System.out.println(uhr.gibUhrzeit());
		}
		
		UhrenanzeigeCrap uhrCrap = new UhrenanzeigeCrap();
		for(int i=0; i<1000; i++){
			uhrCrap.taktsignalGeben();
			System.out.println(uhrCrap.gibUhrzeit());
		}
	}
}
