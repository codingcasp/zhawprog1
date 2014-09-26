package prak02;

public class Praktikum02 {
	
	public static void main(String[] args) {
		Car penisCar = new Car("Chickmagnet", "Revolver", 8, true);
		penisCar.changeStorageAmount(13);
		penisCar.changeStorageAmount(10);
		penisCar.changeStorageAmount(-3);
		penisCar.outCarInformation();
		
		Car pussyCar = new Car("Sexy", "Baby RS", 4.5, true);
		pussyCar.changeStorageAmount(5);
		pussyCar.outCarInformation();
		
	}
}


