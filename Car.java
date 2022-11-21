import java.util.Scanner;
public class Car {
public String brand, model;
public int amountOfFuel;
	public static void main(String[] args) {
	
	Car car = new Car("Toyota", "RAV4", 40);
	System.out.println("a=accelerate b=break x=exit");

	car.printData();
	
// Ohjelmointi on hauskaa

	Scanner in = new Scanner(System.in);
	
	String entry;
	do	{
		entry = in.nextLine();
		if (entry.equals("a")) {car.accelerate();
		System.out.println("a=accelerate b=break x=exit");}
		else if (entry.equals("b")) {car.brake();
		System.out.println("a=accelerate b=break x=exit");}
		}
	while (!entry.equals("x"));
	in.close();
	
	car.printData();
	
	} // end of main
	
//method 1 brake
public void brake() {
	System.out.println("Car is braking");
	}

// method 2 accelerate
public void accelerate() {
	// amountOfFuel--; alternative way for decreasing 1
	// amountOfFuel = amountOfFuel -1; // this will give more flexibility to the decreasing amount
	if (amountOfFuel>0) {amountOfFuel = amountOfFuel -1;
					System.out.println("Car is accelerating");
					} // end if
	//else {System.out.println("No fuel to accelerate");}
	} // end accelerate

//method 3 printData
public void printData() {
		System.out.println("Brand: " + brand + "\nModel: " + model + "\nFuel: " + amountOfFuel);
	} // end printData

//method 4 refuel
public void refuel(int amount) {
		amountOfFuel = amountOfFuel + amount;
		System.out.println("Fuel in the tank: " + (amountOfFuel - amount) + "\nRefuel: " + amount + "\nFuel in the tank after the refuel: " + amountOfFuel);
	} // end refuel

//method 5 getModel
public String getModel() {
return model;

	} // end getModel

//method 6 setModel
public void setModel(String sModel) {
		model = sModel;
	} // end setModel


// creating default constructor
public Car () {
	brand = "";
	model = "";
	amountOfFuel = 0;
}; //end of default constructor

//creating parameterized constructor
public Car (String nBrand, String nModel, int namountOfFuel) {
	brand = nBrand;
	model = nModel;
	amountOfFuel = namountOfFuel;
	System.out.println("Brand: " + brand + "\nModel: " + model + "\nFuel: " + amountOfFuel);
};

} // end of class Car
