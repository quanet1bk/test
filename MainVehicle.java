import java.util.ArrayList;
import java.util.List;

interface Vehicle {
	void start();

	void stop();

	double getSpeed();

	default void startEngine() {
		
	}
}

class Car implements Vehicle {
	private double speed;

	public Car(double InitialSpeed) {
		this.speed = InitialSpeed;
	}

	public double getSpeed() {
		return speed;
	}

	@Override
	public void start() {
		this.speed = 50;
	}

	@Override
	public void stop() {
		this.speed = 0;
	}

}

class Bicycle implements Vehicle {
	private double speed;

	public Bicycle(double InitialSpeed) {
		this.speed = InitialSpeed;
	}

	@Override
	public void start() {

		this.speed = 15;

	}

	@Override
	public void stop() {

		this.speed = 0;
	}

	@Override
	public double getSpeed() {

		return this.speed;
	}

}

class Motorcycle implements Vehicle {
	private double speed;

	public Motorcycle(double InitialSpeed) {
		this.speed = InitialSpeed;
	}

	@Override
	public void start() {

		this.speed = 80;
	}

	@Override
	public void stop() {

		this.speed = 0;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

}

public class MainVehicle {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Car(25));
		vehicles.add(new Bicycle(10));
		vehicles.add(new Motorcycle(20));

		for (Vehicle ve : vehicles) {
			ve.start();
			System.out.println("Started velocity: " + ve.getSpeed() + " km/h");
		}

		for (Vehicle ve : vehicles) {
			ve.stop();
			System.out.println("Stopped velocity: " + ve.getSpeed() + " km/h");
		}
	}
}
