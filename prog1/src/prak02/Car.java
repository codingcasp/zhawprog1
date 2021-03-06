package prak02;

import java.util.Scanner;

public class Car {

	private String brand;
	private String type;
	private double ccm;
	private boolean hasTurbo;
	private int storageAmount;

	/**
	 * Constructor for objects of class Auto with parameters
	 * 
	 * @param marke
	 *            Initial brand name of this Auto instance
	 * @param type
	 *            Initial type of this Auto isntance
	 * @param hasTurbo
	 *            Initial boolean to set a turbo charged monster Auto instance
	 */
	public Car(String brand, String type, double ccm, boolean hasTurbo) {
		this.brand = brand;
		this.type = type;
		this.ccm = ccm;
		this.hasTurbo = hasTurbo;
		System.out.println("======");
		System.out.println("Neues Fahrzeug "+this.brand + " " + this.type + ", (" + this.ccm + " Liter) registriert.");
	}

	/**
	 * Returns the brand name of an instance
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Sets the brand name of an instance
	 * 
	 * @return brand
	 */
	public void setBrand(String marke) {
		if (marke.length() > 10 || marke.length() < 3) {
			if (this.brand == null) {
				this.brand = "___";
				System.out
						.println("Marke: "
								+ marke
								+ " ungültig. Marke muss 3 bis maximal 10 Zeichen sein. ");
			} else {
				System.out
						.println("Marke: "
								+ marke
								+ " ungültig, alter Wert beibehalten. Marke muss 3 bis maximal 10 Zeichen sein. ");
			}
		} else {
			this.brand = marke;
		}
	}

	/**
	 * Returns the car type of an instance
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the car type of an intance
	 * 
	 * @param type
	 */
	public void setType(String type) {
		if (type.length() > 10 || type.length() < 3) {
			if (this.type == null) {
				this.type = "___";
				System.out.println("Typ: " + type + " ungültig. Typ muss 3 bis maximal 10 Zeichen sein. ");
			} else {
				System.out.println("Typ: " + type + " ungültig. Alter Wert beibehalten. Typ muss 3 bis maximal 10 Zeichen sein. ");
			}
		} else {
			this.type = type;
		}
	}

	/**
	 * Returns the engine ccm of an instance
	 */
	public double getCcm() {
		return ccm;
	}

	/**
	 * Sets the engine ccm of an instance. The value of ccm has to be between
	 * numeric -10 and 10 or the already set engine ccm will not be changed.
	 * 
	 * @param hubraum
	 */
	public void setCcm(double ccm) {
		if (ccm < 0.5 || ccm > 8) {
			if (ccm == 0) {
				this.ccm = 0;
				System.out.println("Hubraum " + ccm + " ungültig. Hubraum zwischen 0.5 und 8 Litern angeben");
			} else {
				System.out.println("Hubraum " + ccm + " ungültig, alter Wert beibelassen. Hubraum zwischen 0.5 und 8 Litern angeben");
			}
		} else {
			this.ccm = ccm;
		}
	}

	/**
	 * Returns true if the car is turbo charged
	 */
	public boolean isHasTurbo() {
		return hasTurbo;
	}

	/**
	 * Sets this true if the car is instanced car is turbo charged
	 */
	public void setHasTurbo(boolean hasTurbo) {

		this.hasTurbo = hasTurbo;
	}

	/**
	 * Returns the amount in storage of an instance
	 */
	public int getStorageAmount() {
		return this.storageAmount;
	}

	/**
	 * Changes the amount in storage for an instance. The maximum amount of change can not
	 * be bigger than 10 (positive or negative).
	 * @param change
	 */
	public void changeStorageAmount(int change) {
		if (change < -10 || change > 10) {
			System.out.println("Zu grosse Veränderung, gültiger Bereich von -10 bis +10");
		} else {
			String outMsg = "";
			outMsg = "Bestand verändert (" + change + "). Alter Bestand : " + this.storageAmount;

			this.storageAmount += change;
			outMsg = outMsg + " Neuer Bestand : " + this.storageAmount;
			System.out.println(outMsg);
		}
	}

	/**
	 * Returns an overview of all instanced cars
	 */
	public void outCarInformation() {
		String outline1;
		String outline2;
		String outline3;
		outline1 = this.brand + " " + this.type + ", " + this.ccm + " Liter";
		outline2 = "Code: " + this.brand.substring(0, 3) + "-" + this.type.substring(0, 3) + "-" + this.ccm;
		
		if (this.hasTurbo) {
			outline1 = outline1 + " turbo";
			outline2 = outline2 + "-t";
			outline3 = "Lagerbestand: " + this.storageAmount;
			
			System.out.println("------");
			System.out.println(outline1 + "\n" + outline2 + "\n" + outline3);
			System.out.println("------");
		}
	}
	
	
	/**
	 * Validates a string has more than 3 to 10 characters.
	 * @param string
	 * @return
	 */
	public boolean checkStringLength(String string){
		if(string.length() < 3 || string.length() > 10) {
			System.out.println("Ungültige Eingage, " + string.length() + " Zeichen, 3 bis 10 erlaubt.");
			return false;
		}
		return true;
	}
	
	
	public Car inputCar() {
		Scanner user_input = new Scanner( System.in );
		System.out.println("Manuelle Eingabe!");
		
		// brand
		do {
			System.out.println("Marke (3 bis 10 Zeichen):");
			brand = user_input.next();
		} while(checkStringLength(brand) == false);
		
		// type
		do {
			System.out.println("Type (3 bis 10 Zeichen):");
			type = user_input.next();
		} while(checkStringLength(type) == false);
		
		// ccm
		String _ccm;
		double ccm;
		do {
			System.out.println("Hubraum (0.5 bis 8):");
			_ccm = user_input.next();
			ccm = Double.parseDouble(_ccm);
		} while(ccm < 0.5 || ccm > 8);
		
		// has turbo
		String _hasTurbo;
//		do {
			System.out.println("Turbo (yes/no):");
			_hasTurbo = user_input.next().toLowerCase();
			System.out.println("Turbo Eingabe: '" + _hasTurbo + "'");
//		} while(_hasTurbo != "yes" && _hasTurbo != "no");
		
		if(_hasTurbo == "yes") {
			hasTurbo = true;
		} else {
			hasTurbo = false;
		}
		
		// starageAmount
		String _change;
		int change;
//		do {
//			System.out.println("Bestand (1 bis 10):");
//			_change = user_input.next();
//			_change = String.parseDouble(_change);
//		} while(change < 1 || change > 10);
		
		Car manualCar = new Car(brand, type, ccm, hasTurbo);
		return manualCar;
	}
}
