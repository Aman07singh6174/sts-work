package oops.java;

class IndianCar {

	String company = "Indian Motors";
	int wheels = 4;

	void start() {
		System.out.println("Car Started");
	}

	void stop() {
		System.out.println("Car Stopped");
	}

	void speed() {
		System.out.println("Speed: 120 km/h");
	}

	void fuel() {
		System.out.println("Fuel Type: Petrol");
	}

	void horn() {
		System.out.println("Horn Sound");
	}
}

class SUV extends IndianCar {

	int seats = 7;
	String type = "SUV";
}

class Sedan extends IndianCar {

	int seats = 5;
	String type = "Sedan";
}

class Scorpio extends SUV {

	void showScorpio() {
		System.out.println("Model : Scorpio");
	}
}

class Verna extends Sedan {

	void showVerna() {
		System.out.println("Model : Verna");
	}
}

public class inharitention {

	public static void main(String[] args) {

		Scorpio s1 = new Scorpio();
		Scorpio s2 = new Scorpio();

		Verna v1 = new Verna();
		Verna v2 = new Verna();

		System.out.println("------ Scorpio Object 1 ------");
		s1.start();
		s1.speed();
		s1.horn();
		s1.showScorpio();

		System.out.println();

		System.out.println("------ Scorpio Object 2 ------");
		s2.stop();
		s2.fuel();
		s2.showScorpio();

		System.out.println();

		System.out.println("------ Verna Object 1 ------");
		v1.start();
		v1.speed();
		v1.showVerna();

		System.out.println();

		System.out.println("------ Verna Object 2 ------");
		v2.stop();
		v2.fuel();
		v2.showVerna();
	}
}
